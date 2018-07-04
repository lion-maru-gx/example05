package jp.gr.java_conf.lion_maru_gx.example.example05;

public class Controller {
	private App app = null;

	/**
	 * appを取得します。
	 * @return app
	 */
	public App getApp() {
	    return app;
	}

	/**
	 * appを設定します。
	 * @param app app
	 */
	public void setApp(App app) {
	    this.app = app;
	}

	public void nextPage(App.Page page){
		app.nextPage(page);
	}

	public void prevPage(){
		app.prevPage();
	}
}
