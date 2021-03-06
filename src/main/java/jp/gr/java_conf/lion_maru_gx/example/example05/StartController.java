package jp.gr.java_conf.lion_maru_gx.example.example05;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartController extends Controller {

    @FXML
    protected void handleVoiceModeButtonAction(ActionEvent event) {
    	Button test = (Button)event.getSource();
    	System.out.println(test.getId());
        nextPage( App.Page.VoiceMode);
    }

    @FXML
    protected void handlePerformanceModeButtonAction() {
        nextPage( App.Page.PerformanceMode);
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
