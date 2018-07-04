package jp.gr.java_conf.lion_maru_gx.example.example05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
    /**
     * ステージ
     */
    private Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Foo.xml"));
		loader.load();
	}
}
