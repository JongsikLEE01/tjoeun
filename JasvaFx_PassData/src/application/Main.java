package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	private static Scene scece;
	
	@Override
	public void start(Stage stage) {
		try {
			scece = new Scene(loadFXML("a"));
			stage.setScene(scece);
			scece.getStylesheets().add(getClass().getResource("application.css").toString());
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public static Parent loadFXML(String fxml) throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml+".fxml"));
		return fxmlLoader.load();
	}
	static void setRoot(String fxml) throws IOException{
		scece.setRoot(loadFXML(fxml));
	}
	
	// 새로 열린 화면으로 지정
	static void setRoot(Parent root) throws IOException{
		scece.setRoot(root);
	}
}
