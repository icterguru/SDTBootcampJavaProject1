package ch15JavaGUIProgramming;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddNumbersDemo extends Application {

	private Label lblEnterN1 = new Label("Enter n1: ");
	private Label lblEnterN2 = new Label("Enter n2: ");
	private TextField txtNum1 = new TextField();
	private TextField txtNum2 = new TextField();
	private Button btnSum = new Button("+");
	private Label lblSum = new Label("Sum: ");
	private Label lblDisplaySum = new Label();


	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		GridPane myPane = new GridPane();
		myPane.setHgap(10);
		myPane.setVgap(10);
		Scene scene = new Scene(myPane, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Add two numbers");

		myPane.add(lblEnterN1, 0, 0);
		myPane.add(txtNum1, 1, 0);
		myPane.add(lblEnterN2, 0, 1);
		myPane.add(txtNum2, 1, 1);
		myPane.add(lblSum,0,2);
		myPane.add(lblDisplaySum,1,2);
		myPane.add(btnSum,2,2);

		myPane.setAlignment(Pos.CENTER);

		btnSum.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				if ((txtNum1.getText().length()==0) && (txtNum2.getText().length()==0))
					lblDisplaySum.setText(""+ 0.0 );
				
				else if (txtNum1.getText().length()==0)
					lblDisplaySum.setText(""+ (0.0 + Double.parseDouble(txtNum2.getText())));

				else if (txtNum2.getText().length()==0)
					lblDisplaySum.setText(""+ (0.0 + Double.parseDouble(txtNum1.getText())));

				else
					lblDisplaySum.setText(""+ (Double.parseDouble(txtNum1.getText()) + 
							Double.parseDouble(txtNum2.getText())) );

			}

		});

	}


}