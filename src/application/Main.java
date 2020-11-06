package application;
	
import java.util.ArrayList;
import java.util.List;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			Scene scene = new Scene(root, 300, 300);
			
			Button btn1 = new Button("Rojo");
			Button btn2 = new Button("Verde");
			Button btn3 = new Button("azul");
			
			Publisher pb = new Publisher();
			Observer sb1 = new Observer(btn1);
			Observer sb2 = new Observer(btn2);
			Observer sb3 = new Observer(btn3);
			pb.addObserver(sb1);
			pb.addObserver(sb2);
			pb.addObserver(sb3);
			
			
			btn1.setOnMouseClicked(event -> {
				pb.notifySubs();
		        btn1.setDisable(true);
		        root.setStyle("-fx-background-color: red");
		        System.out.println("Nuevo color: rojo");
		    });

			btn2.setOnMouseClicked(event -> {
				pb.notifySubs();
		        btn2.setDisable(true);
		        root.setStyle("-fx-background-color: green");
		       System.out.println("Nuevo color: verde");
		    });
			
			btn3.setOnMouseClicked(event -> {
				pb.notifySubs();
		        btn3.setDisable(true);
		        root.setStyle("-fx-background-color: blue");
		        System.out.println("Nuevo color: azul");
		    });
			

			
			
			root.getChildren().add(btn1);
			root.getChildren().add(btn2);
			root.getChildren().add(btn3);
			root.setAlignment(Pos.CENTER);
			root.setSpacing(20);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
