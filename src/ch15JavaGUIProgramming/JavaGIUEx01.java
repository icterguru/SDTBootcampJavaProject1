package ch15JavaGUIProgramming;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaGIUEx01 extends Application{
	private Button btnClickMe = new Button("Click me");
	private Label lblShowClickedMe  = new Label();


	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane myPane = new GridPane();
		myPane.setHgap(10);
		myPane.setVgap(10);
		Scene myScene = new Scene(myPane, 500, 300);
		primaryStage.setScene(myScene);
		primaryStage.show();

		primaryStage.setTitle("Hello World- Welocme to JavaFX");
		myPane.setAlignment(Pos.CENTER);
		myPane.add(btnClickMe , 0, 1);
		myPane.add(lblShowClickedMe, 0, 2);

		btnClickMe.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Button clicked");
				lblShowClickedMe.setText("The button clicked");
			}
		});

	}

}
