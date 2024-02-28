package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class aController {
	@FXML
	TextField tInput;
	
	public void PassToB(ActionEvent e) throws IOException {
		// b로 데이터 전달
		FXMLLoader bFXML = new FXMLLoader(getClass().getResource("b.fxml"));
		Parent broot = bFXML.load();
		
		bController bController = bFXML.getController();	// b컨트롤러 가져오기
		
		String data = tInput.getText();		// a의 입력갑 가져오기
		bController.showText(data+"AtoB");			// A -> B로 데이터 전달
		
//		Main.setRoot("b");
		Main.setRoot(broot);	// aroot로 전달받은 데이터를 오버라이딩한 setRoot로 전달해 데이터를 넘겨주며 화면을 전환
	}
	
	public void showText(String data) {
		tInput.setText(data);
	}
}