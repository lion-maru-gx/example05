package jp.gr.java_conf.lion_maru_gx.example.example05;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class StartController extends Controller {

    @FXML
    protected void handlePage1ButtonAction() {
        nextPage( App.Page.Page1);
    }

    @FXML
    protected void handleSystemButtonAction(){
        nextPage(App.Page.System);
    }

    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleEndButtonAction() {
    	Platform.exit();
    }

}
