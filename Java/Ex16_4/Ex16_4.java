package Ex16_4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex16_4 extends Application {
    @Override
    public void start(Stage stage) {
        VBox vbx1=new VBox();
        TextField Input1=new TextField();
        TextField Input2=new TextField();
        Label mle=new Label("Mile",Input1);
        Label kil=new Label("Kilometer",Input2);
        mle.setContentDisplay(ContentDisplay.RIGHT);
        kil.setContentDisplay(ContentDisplay.RIGHT);
        vbx1.setAlignment(Pos.CENTER);
        vbx1.setSpacing(15);

        vbx1.getChildren().addAll(mle,kil);

        Input1.setOnKeyPressed(e ->{
            if(e.getCode()== KeyCode.ENTER)
            {
                double x=Double.parseDouble(Input1.getText());
                String ans=String.valueOf(x*1.61);
                Input2.setText(ans);
            }
        });

        Input2.setOnKeyPressed(e ->{
            if(e.getCode()== KeyCode.ENTER)
            {
                double x=Double.parseDouble(Input2.getText());
                String ans=String.valueOf(x/1.61);
                Input1.setText(ans);
            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(vbx1);

        Scene scene = new Scene(borderPane, 300, 150);
        stage.setTitle("Ex16_4");
        stage.setScene(scene);
        stage.show();
    }
}
