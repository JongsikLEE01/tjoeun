package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class controller implements Initializable {
	@FXML
	private Label mylabel;
	@FXML
	private ListView<String> myListView;
	String food[] = {"떡볶이", "덮밥", "피자"};
	String currentFood;
	
	// fxml에 연결된 화면에 요소에 대한 초기화 작업을 하는 메소드
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// food[] 배열 데이터 초기화
		myListView.getItems().addAll(food);
		
		// 리스트뷰의 항목을 선택 시 이벤트 지정
		myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// 현재 선택한 아이템 항목을 가져와 currentFood에 지정
				currentFood = myListView.getSelectionModel().getSelectedItem();
				mylabel.setText(currentFood);
			}
		});
		
		// 더블클릭 이벤트
		myListView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// 더블클릭
				if(event.getClickCount() == 2) {
					System.out.println("더블 클릭...");
					currentFood = myListView.getSelectionModel().getSelectedItem();
					System.out.println("item>> "+currentFood);
				}
			}
		});
	
	}
}