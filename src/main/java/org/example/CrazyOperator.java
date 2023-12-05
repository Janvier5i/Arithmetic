package org.example;

public class CrazyOperator extends  ArithmeticOperator{
    private int num1;
    private  int num2;

    public CrazyOperator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public int add() {
        return num1 + num2;
    }

    @Override
    public int subtract() {
        return num1 - num2;
    }

    @Override
    public void multiply() {
        System.out.println( add() * subtract());
    }
}
