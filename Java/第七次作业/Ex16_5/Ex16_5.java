package Ex16_5;

import java.io.IOException;

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

public class Ex16_5 extends Application {
    public String decimalToBinary(int x) {
        String ans = "";
        while (x > 0) {
            ans += String.valueOf(x % 2);
            x /= 2;
        }
        StringBuilder xs = new StringBuilder(ans);
        return xs.reverse().toString();
    }

    public String decimalToHex(int x) {
        String ans = "";
        while (x > 0) {
            int now = x % 16;
            char ad;
            if (now <= 9)
                ad = (char) (now + '0');
            else
                ad = (char) (now - 10 + 'A');
            ans += ad;
            x /= 16;
        }
        StringBuilder xs = new StringBuilder(ans);
        return xs.reverse().toString();
    }

    public int hexToDecimal(String x) {
        int ans = 0;
        int base = 1;
        for (int i = x.length() - 1; i >= 0; --i) {
            int now;
            char nowc = x.charAt(i);
            if (nowc <= '9')
                now = (int) (nowc - '0');
            else
                now = (int) (nowc - 'A' + 10);
            ans += base * now;
            base *= 16;
        }
        return ans;
    }

    public int binaryToDecimal(String x) {
        int ans = 0;
        int base = 1;
        for (int i = x.length() - 1; i >= 0; --i) {
            int now = (int) (x.charAt(i)) - 48;
            ans += now * base;
            base *= 2;
        }
        return ans;
    }

    @Override
    public void start(Stage stage) throws IOException {
        VBox vbx1 = new VBox();
        TextField Input1 = new TextField();
        TextField Input2 = new TextField();
        TextField Input3 = new TextField();
        Label dec = new Label("Decimal", Input1);
        Label hex = new Label("Hex", Input2);
        Label bin = new Label("Binary", Input3);
        dec.setContentDisplay(ContentDisplay.RIGHT);
        hex.setContentDisplay(ContentDisplay.RIGHT);
        bin.setContentDisplay(ContentDisplay.RIGHT);

        vbx1.setAlignment(Pos.CENTER);
        vbx1.setSpacing(15);

        vbx1.getChildren().addAll(dec, hex, bin);

        Input1.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                int x = Integer.parseInt(Input1.getText());
                Input2.setText(String.valueOf(decimalToHex(x)));
                Input3.setText(String.valueOf(decimalToBinary(x)));
            }
        });

        Input2.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                String x = Input2.getText();
                int val = hexToDecimal(x);
                Input1.setText(String.valueOf(val));
                Input3.setText(String.valueOf(decimalToBinary(val)));
            }
        });

        Input3.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                String x = Input3.getText();
                int val = binaryToDecimal(x);
                Input1.setText(String.valueOf(val));
                Input2.setText(String.valueOf(decimalToHex(val)));
            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(vbx1);

        Scene scene = new Scene(borderPane, 300, 150);
        stage.setTitle("Ex16_5");
        stage.setScene(scene);
        stage.show();
    }

}
