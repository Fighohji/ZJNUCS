package Ex15_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Ex15_4 extends Application {
    @Override
    public void start(Stage stage) {
        HBox hbx1 = new HBox();
        HBox hbx2 = new HBox();
        Text txt1 = new Text("input1:");
        Text txt2 = new Text("input2:");
        Text res = new Text("Result:");
        TextField input1 = new TextField();
        TextField input2 = new TextField();
        TextField result = new TextField();
        result.setEditable(false);
        hbx1.getChildren().addAll(txt1, input1, txt2, input2, res, result);
        Button btnAdd = new Button("Add");
        Button btnSub = new Button("Sub");
        Button btnMul = new Button("Mul");
        Button btnDiv = new Button("Div");
        hbx2.getChildren().addAll(btnAdd, btnSub, btnMul, btnDiv);
        btnAdd.setOnAction(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            String ans = String.valueOf(num1 + num2);
            result.setText(ans);
        });
        btnSub.setOnAction(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            String ans = String.valueOf(num1 - num2);
            result.setText(ans);
        });
        btnMul.setOnAction(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            String ans = String.valueOf(num1 * num2);
            result.setText(ans);
        });
        btnDiv.setOnAction(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            String ans;

            if (num2 == 0) {
                ans = "div by 0";
            } else {
                ans = String.valueOf(num1 / num2);
            }
            result.setText(ans);
        });

        BorderPane bdp = new BorderPane();
        bdp.setCenter(hbx1);
        bdp.setBottom(hbx2);
        Scene scene = new Scene(bdp, 300, 150);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String []args){
        launch();
    }
}
