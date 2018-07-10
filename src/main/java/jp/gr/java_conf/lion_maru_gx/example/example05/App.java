package jp.gr.java_conf.lion_maru_gx.example.example05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Stack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jp.gr.java_conf.lion_maru_gx.example.comon.MidiUtil;

/**
 * Hello world!
 *
 */
public class App extends Application {
	private static Properties properties = new Properties();
	// プロパティファイルのパスを指定する
	private static String configFile = "java.properties";
	private Stage stage;
	private final int width = 800;
	private final int height = 600;

	public static enum Page {
		Start("start.fxml"), VoiceMode("VoiceMode.fxml"), VoiceEdit("VoiceEdit.fxml"), PerformanceMode(
				"PerformanceMode.fxml"), PerformanceEdit("PerformanceEdit.fxml"), System("System.fxml");

		// フィールドを定義
		private String url;

		// コンストラクタを定義
		private Page(String url) {
			this.url = url;
		}

		// メソッド
		public String getValue() {
			return this.url;
		}

	};

	private Page currPage = null;
	private Stack<Page> pageStack = new Stack<>();

	public static void main(String[] args) {
		try {
			properties.load(new FileInputStream(configFile));
			if ((properties.getProperty("inputDevice") != null)&&(properties.getProperty("inputDevice").length() > 0)) {
				MidiUtil.setInputPort(properties.getProperty("inputDevice"));
			}
			if ((properties.getProperty("outputDevice") != null)&&(properties.getProperty("outputDevice").length()>0)) {
				MidiUtil.setOutputPort(properties.getProperty("outputDevice"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		nextPage(Page.Start);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		MidiUtil.close();
		properties.setProperty("inputDevice", MidiUtil.getInputDeviceName());
		properties.setProperty("outputDevice", MidiUtil.getOutputDeviceName());
		OutputStream ostream = new FileOutputStream(configFile);
		properties.store(ostream, getClass().getName());
		ostream.close();
		super.stop();
	}

	/**
	 * Mainへ遷移する
	 *
	 * @param labelText
	 */
	public void nextPage(Page page) {
		this.setPage(page.url);
		if (currPage != null) {
			pageStack.push(currPage);
		}
		currPage = page;
	}

	public void prevPage() {
		currPage = pageStack.pop();
		this.setPage(currPage.url);
	}

	/**
	 * シーンの変更
	 *
	 * @param controller
	 */
	private void setPage(String url) {
		Parent root;
		FXMLLoader loader;
		try {
			loader = new FXMLLoader(getClass().getResource(url));
			root = loader.load();
			stage.setScene(new Scene(root, width, height));
			Controller controller = (Controller) loader.getController();
			controller.setApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
