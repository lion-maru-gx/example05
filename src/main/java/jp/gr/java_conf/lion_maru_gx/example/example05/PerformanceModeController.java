package jp.gr.java_conf.lion_maru_gx.example.example05;

import javafx.fxml.FXML;

public class PerformanceModeController extends Controller {

	@FXML
    protected void handleNextButtonAction(){
        nextPage(App.Page.PerformanceEdit);
    }

	@FXML
    protected void handlePrevButtonAction(){
        prevPage();
    }

}
