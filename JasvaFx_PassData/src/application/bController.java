package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class bController {
	@FXML
	TextField tOutput;
	
	public void PassToA(ActionEvent e) throws IOException {
		// b로 데이터 전달
		FXMLLoader aFXML = new FXMLLoader(getClass().getResource("a.fxml"));
		Parent aroot = aFXML.load();
				
		aController aController = aFXML.getController();	// b컨트롤러 가져오기
				
		String data = tOutput.getText();		// a의 입력갑 가져오기
		aController.showText(data+"BtoA");		// A -> B로 데이터 전달
				
//		Main.setRoot("b");	넘겨준 데이터를 전달받지 않고 새로운 인스턴스로 화면전환
		Main.setRoot(aroot);	// aroot로 전달받은 데이터를 오버라이딩한 setRoot로 전달해 데이터를 넘겨주며 화면을 전환
	}
	
	// 전달받은 데이터 텍스트필드에 출력
	public void showText(String data) {
		tOutput.setText(data);
	}
}