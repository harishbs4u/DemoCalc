package com.harish;

public class CalculationRequest {

    private String operation;
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public CalculationRequest( double number1, double number2,String operation) {
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
    }
   


}
