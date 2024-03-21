package com.example.the_last_dance2_api;

import jakarta.persistence.Column;

public class numberRequest {

    @Column(name = "num1", nullable = false)

    private int num1;
    @Column(name = "num2", nullable = false)
    private int num2;

    public numberRequest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public numberRequest() {

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
    public String toString() {
        return "numberRequest{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
