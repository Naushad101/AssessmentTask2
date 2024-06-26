package com.example.service;

public class CalculationServiceUsingRunnable implements Runnable {

    int n;
    int result;
    public CalculationServiceUsingRunnable(int n){
        this.n=n;
    }

    @Override
    public void run() {
        this.result=n*n;
    }
    
}
