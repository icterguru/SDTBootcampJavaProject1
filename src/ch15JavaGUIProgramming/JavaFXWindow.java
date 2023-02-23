package ch15JavaGUIProgramming;
import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Pos;

import javafx.scene.Node;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class JavaFXWindow extends Application{

	public static void main(String[] args) {
          Application.launch(args);
     }
 
     private Button btnClickMe = new Button("Click Me");
     private Label lblShowClick = new Label();

     @Override

     public void start(Stage myStage) throws Exception {

          GridPane myPane = new GridPane();
          myPane.setHgap(10);
          myPane.setVgap(10);
          Scene myScene = new Scene(myPane, 500, 300);
          myStage.setScene(myScene);
          myStage.show();
          myStage.setTitle("Hello World");
          myPane.add(btnClickMe , 0, 1);
          myPane.add(lblShowClick, 0, 2);
          myPane.setAlignment(Pos.CENTER);
          btnClickMe.setOnAction(new EventHandler<ActionEvent>()
                   {
              public void handle(ActionEvent e) {
                   System.out.println("Button clicked");
                   lblShowClick.setText("You clicked me");
              } });


     }

}

 