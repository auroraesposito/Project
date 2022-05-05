package org.openjfx.wordle;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Wordle");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        
        grid.setHgap(10);
        grid.setVgap(10);
        
        grid.setPadding(new Insets(5));
        
        Scene scene = new Scene(grid, 400, 300);
        Text title = new Text("Prova a indovinare la parola! Hai cinque tentativi");
        title.setFont(Font.font("Sans serif", FontWeight.EXTRA_BOLD, 10));
        title.setTextAlignment(TextAlignment.CENTER);
        grid.add(title, 0, 0, 2, 1);
        
        TextField prima = new TextField();
        prima.setPrefWidth(30);
        TextField seconda = new TextField();
        seconda.setPrefWidth(30);
        TextField terza = new TextField();
        terza.setPrefWidth(30);
        TextField quarta = new TextField();
        quarta.setPrefWidth(30);
        TextField quinta = new TextField();
        quinta.setPrefWidth(30);
        

       HBox hbox = new HBox(5);
       hbox.setSpacing(5);
       hbox.setPadding(new Insets(10, 0, 0, 10));
       hbox.getChildren().addAll(title,prima, seconda, terza, quarta, quinta);
       
       int maxDigits = 1;
       prima.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
           if (newValue.length() == 4 && oldValue.length() != 1) {
               prima.setText(newValue + "/");
           } else if (newValue.length() == 7 && oldValue.length() != 8 || newValue.length() == 10 && oldValue.length() != 13) {
               prima.setText(newValue + ".");
           }
           if (newValue.length() > maxDigits) {
               prima.setText(oldValue);
           }

       });
       
       
    
       seconda.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
           if (newValue.length() == 4 && oldValue.length() != 1) {
               seconda.setText(newValue + "/");
           } else if (newValue.length() == 7 && oldValue.length() != 8 || newValue.length() == 10 && oldValue.length() != 13) {
               seconda.setText(newValue + ".");
           }
           if (newValue.length() > maxDigits) {
               seconda.setText(oldValue);
           }

       });
       
       terza.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
           if (newValue.length() == 4 && oldValue.length() != 1) {
        	   terza.setText(newValue + "/");
           } else if (newValue.length() == 7 && oldValue.length() != 8 || newValue.length() == 10 && oldValue.length() != 13) {
        	   terza.setText(newValue + ".");
           }
           if (newValue.length() > maxDigits) {
        	   terza.setText(oldValue);
           }

       });
       
       quarta.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
           if (newValue.length() == 4 && oldValue.length() != 1) {
        	   quarta.setText(newValue + "/");
           } else if (newValue.length() == 7 && oldValue.length() != 8 || newValue.length() == 10 && oldValue.length() != 13) {
        	   quarta.setText(newValue + ".");
           }
           if (newValue.length() > maxDigits) {
        	   quarta.setText(oldValue);
           }

       });

       quinta.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
           if (newValue.length() == 4 && oldValue.length() != 1) {
        	   quinta.setText(newValue + "/");
           } else if (newValue.length() == 7 && oldValue.length() != 8 || newValue.length() == 10 && oldValue.length() != 13) {
        	   quinta.setText(newValue + ".");
           }
           if (newValue.length() > maxDigits) {
        	   quinta.setText(oldValue);
           }

       });
       
       prima.setOnKeyPressed( evt ->{
           if(evt.getCode().equals(KeyCode.ENTER)){
               
               seconda.requestFocus();
           }
       });
       
       seconda.setOnKeyPressed( evt ->{
           if(evt.getCode().equals(KeyCode.ENTER)){
               
               terza.requestFocus();
           }
       });
       
       terza.setOnKeyPressed( evt ->{
           if(evt.getCode().equals(KeyCode.ENTER)){
               
               quarta.requestFocus();
           }
       });
       
       quarta.setOnKeyPressed( evt ->{
           if(evt.getCode().equals(KeyCode.ENTER)){
               
               quinta.requestFocus();
           }
       });
       
       quinta.setOnKeyPressed(evt ->{
    	   quinta.setStyle("-fx-background-color:red");
    		  
    	   
       });
       
       
       
       grid.getChildren().addAll(hbox);
        
        stage.setScene(scene);
        stage.show();
    }

    
    
    public static void main(String[] args) {
        launch();
    }

}