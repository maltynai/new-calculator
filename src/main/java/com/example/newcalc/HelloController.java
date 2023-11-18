package com.example.newcalc;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField inputField;

    @FXML
    protected void onButtonPlusClick(){
        calc.setOperator('+');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onButtonMinusClick(){
        calc.setOperator('-');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onButtonTimesClick(){
        calc.setOperator('*');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onButtonDivideClick(){
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        if (d == 0){
            inputField.setText("error");
        }else{
            calc.setOperator('/');
            calc.setOp1(d);
            inputField.setText("");
        }
    }

    @FXML
    protected void onButtonEqualClick() throws DivisionByZeroException {
        String val = inputField.getText();
        double d;
        try {
            d = Double.parseDouble(val);
            calc.setOp2(d);
            calc.calculate();
            d = calc.getResult();
            if (d == (int) d) {
                inputField.setText(Integer.toString((int) d));
            } else {
                inputField.setText(Double.toString(d));
            }
        }  catch (DivisionByZeroException e) {
            inputField.setText(e.getMessage());
        }
    }

    @FXML
    protected void onButtonOneClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "1" );
    }

    @FXML
    protected void onButtonTwoClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "2" );
    }
    @FXML
    protected void onButtonThreeClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "3" );
    }
    @FXML
    protected void onButtonFourClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "4" );
    }
    @FXML
    protected void onButtonFiveClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "5" );
    }
    @FXML
    protected void onButtonSixClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "2" );
    }
    @FXML
    protected void onButtonSevenClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "7" );
    }
    @FXML
    protected void onButtonEightClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "8" );
    }
    @FXML
    protected void onButtonNineClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "9" );
    }
    @FXML
    protected void onButtonZeroClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "0" );
    }
    @FXML
    protected void onButtonClearClick(){
        inputField.setText("");
    }


}