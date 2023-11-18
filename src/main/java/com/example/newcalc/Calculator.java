package com.example.newcalc;

public class Calculator {

    private double operand1;
    private double operand2;
    private char operator;
    private double result;

    public void calculate() throws DivisionByZeroException{
        if(this.operator == '+') {
            this.result = this.operand1 + this.operand2;
        }else if(this.operator == '-'){
            this.result = this.operand1 - this.operand2;
        }else if(this.operator == '*'){
            this.result = this.operand1 * this.operand2;
        }else if(this.operator == '/'){
            if(operand2 != 0){
                this.result = this.operand1 / this.operand2;
            } else {
                throw new DivisionByZeroException("Division by zero!");

            }

        }
    }


    public void setOp1(double operand1) {
        this.operand1 = operand1;
    }


    public void setOp2(double operand2) {
        this.operand2 = operand2;
    }


    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }


}