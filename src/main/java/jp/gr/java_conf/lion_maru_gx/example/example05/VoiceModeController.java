package jp.gr.java_conf.lion_maru_gx.example.example05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class VoiceModeController extends Controller implements Initializable {
	@FXML
	Button button0;
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	Button button3;
	@FXML
	Button button4;
	@FXML
	Button button5;
	@FXML
	Button button6;
	@FXML
	Button button7;
	@FXML
	Button button8;
	@FXML
	Button button9;
	@FXML
	Button button10;
	@FXML
	Button button11;
	@FXML
	Button button12;
	@FXML
	Button button13;
	@FXML
	Button button14;
	@FXML
	Button button15;
	@FXML
	Button button16;
	@FXML
	Button button17;
	@FXML
	Button button18;
	@FXML
	Button button19;
	@FXML
	Button button20;
	@FXML
	Button button21;
	@FXML
	Button button22;
	@FXML
	Button button23;
	@FXML
	Button button24;
	@FXML
	Button button25;
	@FXML
	Button button26;
	@FXML
	Button button27;
	@FXML
	Button button28;
	@FXML
	Button button29;
	@FXML
	Button button30;
	@FXML
	Button button31;
	@FXML
	Button button32;
	@FXML
	Button button33;
	@FXML
	Button button34;
	@FXML
	Button button35;
	@FXML
	Button button36;
	@FXML
	Button button37;
	@FXML
	Button button38;
	@FXML
	Button button39;
	@FXML
	Button button40;
	@FXML
	Button button41;
	@FXML
	Button button42;
	@FXML
	Button button43;
	@FXML
	Button button44;
	@FXML
	Button button45;
	@FXML
	Button button46;
	@FXML
	Button button47;
	Button[] buttonList;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonList= new Button[]{
				button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
				button0,button11,button12,button13,button14,button15,button16,button17,button18,button19,
				button0,button21,button22,button23,button24,button25,button26,button27,button28,button29,
				button0,button31,button32,button33,button34,button35,button36,button37,button38,button39,
				button0,button41,button42,button43,button44,button45,button46,button47};
	}

	@FXML
    protected void handleNextButtonAction(){
        nextPage(App.Page.VoiceEdit);

    }

	@FXML
    protected void handlePrevButtonAction(){
        prevPage();
    }


}
