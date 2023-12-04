package org.example;

public class ArithmeticOperator {
    private int value1, value2;

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public ArithmeticOperator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add() {

        return value1 + value2;
    }

    public int subtract() {
        return value1 - value2;

    }


    public void myOperator() {

        double multiplying = add() * subtract();
        System.out.println(multiplying);

    }
}
