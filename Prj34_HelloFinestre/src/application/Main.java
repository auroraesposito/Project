package application;
	


import java.awt.Insets;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


public class Main extends Application {
	
	Stage window;
	javafx.scene.control.Button button;
	int counter = 0;
	
	
	@Override //cosa fare quando parte l'applicazione
	public void start(Stage primaryStage) { // stage = si comporta come una scena
		try {
			
			window = primaryStage;
			window.setTitle("TSS 2022 - Il miglior corso tss 2022 del mondo!");
			
			GridPane root = new GridPane();
			root.setPadding(new Insets(10));
			root.setHgap(10);
			root.setVgap(10);
			
			
			StackPane root = new StackPane();
			
			HBox box = new HBox();
			
			button = new javafx.scene.control.Button("Cliccami");
			
			
			Text text = new Text();
			button.setOnAction(e -> {
				
				System.out.println("prova");
				System.out.println(e.getSource());
				text.setText("ciao " + counter++);
		
			});
			
			
			GridPane.setConstraints(button, 0, 0);
			GridPane.setConstraints(text, 1, 0);
			
			
			
			root.getChildren().add(box);
			
			Scene scene = new Scene(root,400,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//launch del main chiama start per far poi partire l'applicazione
	public static void main(String[] args) {
		launch(args);
	}
}
