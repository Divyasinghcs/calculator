package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField textField;
    public Button btnOne;
    public Button btnTwo;
    public Button btnThree;
    public Button btnFour;
    public Button btnFive;
    public Button BtnSix;
    public Button btnSeven;
    public Button btnEight;
    public Button btnNine;
    public Button btnZero;
    public Button btnEqual;
    public Button btnplus;
    public Button btnMinus;
    public Button btnMul;
    public Button btnDivide;
    public Button btnClear;
    String result = "";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    textField.setEditable(false);
    }
    public void oneBtn()
    {
        textField.appendText("1");
    }

    public void threeBtn(ActionEvent actionEvent) {
        textField.appendText("3");
    }

    public void twoBtn(ActionEvent actionEvent) {
        textField.appendText("2");
    }

    public void fourBtn(ActionEvent actionEvent) {
        textField.appendText("4");
    }

    public void fiveBtn(ActionEvent actionEvent) {
        textField.appendText("5");
    }

    public void sixBtn(ActionEvent actionEvent) {
        textField.appendText("6");
    }

    public void sevenBtn(ActionEvent actionEvent) {
        textField.appendText("7");
    }

    public void eightBtn(ActionEvent actionEvent) {
        textField.appendText("8");
    }

    public void nineBtn(ActionEvent actionEvent) {
        textField.appendText("9");
    }

    public void ZeroBtn(ActionEvent actionEvent) {
        textField.appendText("0");
    }

    public void equalbtn(ActionEvent actionEvent) {

        result = textField.getText();
        //if(result.equals("")) textField.setText("enter valid input");
       // else {
            Evaluate res = new Evaluate();
            int fResult = res.evaluate(result);
            textField.setText(Integer.toString(fResult));
       // }

    }

    public void plusBtn(ActionEvent actionEvent) {
        textField.appendText("+");
    }

    public void minusBtn(ActionEvent actionEvent) {
        textField.appendText("-");
    }

    public void mulbtn(ActionEvent actionEvent) {
        textField.appendText("*");
    }

    public void divBtn(ActionEvent actionEvent) {
        textField.appendText("/");
    }

    public void clearBtn(ActionEvent actionEvent) {
        textField.setText("");
    }
}
