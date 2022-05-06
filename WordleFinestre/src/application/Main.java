package application;
	


import java.awt.Button;
import java.awt.Insets;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	Stage window;
	javafx.scene.control.Button button;
	int counter = 0;
	
	private TableView table = new TableView();
	
	@Override //cosa fare quando parte l'applicazione
	public void start(Stage primaryStage) { // stage = si comporta come una scena
		
			window = primaryStage;
			window.setTitle("Wordle");
			
			GridPane grid = new GridPane();
			
//			Label label = new Label();
//			GridPane.setConstraints(label,  5, 5);
			
			
			
			Scene scene = new Scene(grid,800,800);
			window.setScene(scene);
			window.show();
			
			Text text = new Text();
			text.setText("Gioca a wordle!");
			
			
			button = new javafx.scene.control.Button("Vai!");
			
			button.setOnAction(e -> {
				grid.getChildren().remove(text);
				grid.getChildren().remove(button);
				
				Text text1 = new Text();
				text1.setText("Ecco Wordle! Hai 5 possibilità per indovinare la parola del giorno!");
			
				
				int rows = 5;
				int columns = 5;
				
				GridPane gridWo = new GridPane();
//				Label labelGrid = new Label();
//				labelGrid.setText("Ecco Wordle! Hai 5 possibilità per indovinare la parola del giorno!");
//				
				
				
				grid.getStyleClass().add("game-grid");
				for(int i = 0; i < columns; i++) {
		            ColumnConstraints column = new ColumnConstraints(40);
		            gridWo.getColumnConstraints().add(column);
		        }

		        for(int i = 0; i < rows; i++) {
		            RowConstraints row = new RowConstraints(40);
		            gridWo.getRowConstraints().add(row);
		        }
				
		        for (int i = 0; i < columns; i++) {
		            for (int j = 0; j < rows; j++) {
		                Pane pane = new Pane();
		               
		                pane.getStyleClass().add("game-grid-cell");
		                if (i == 0) {
		                    pane.getStyleClass().add("first-column");
		                }
		                if (j == 0) {
		                    pane.getStyleClass().add("first-row");
		                }
		                gridWo.add(pane, i, j);
		                
		            }
		        }
		       
		       
		        TextArea textArea = new TextArea();

		        Button button2 = new Button("Inserisci");
		        

		        button.setOnAction(action -> {
		            System.out.println(textArea.getText());
		        });

		        //hbox, vbox, borderpane, stackpane
		        
		        grid.getChildren().add(text1);
		        grid.getChildren().add(gridWo);
		        GridPane.setConstraints(text1, 1, 0);
		        
		        
			});
			
			GridPane.setConstraints(text, 1, 1);
			GridPane.setConstraints(button, 1, 2);
			
					
			grid.getChildren().add(text);
			grid.getChildren().add(button);
		 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
	}
	
	
	//launch del main chiama start per far poi partire l'applicazione
	public static void main(String[] args) {
		
		launch(args);
	}
}
