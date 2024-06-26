package com.example.service;

import java.util.Scanner;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculationService{

    int number;
    public CalculationService(int number){
        this.number=number;
    }


    public int square(int number){
        return number*number;
    }

    public Runnable squareTask = () -> {
        System.out.println("Square of number is: "+ this.square(number));
    };

    public int cube(int number){
        return number*number*number;
    }
 
    // Runnable for cube calculation
    public Runnable cubeTask = () -> {
        
        System.out.println("Cube of " + number + ": " + this.cube(this.number));
    };
 
    public boolean  isEvenOrOdd(int number){
        return number%2==0;
    }

    // Runnable for even check
    public Runnable evenTask = () -> {
        System.out.println(number + " is even: " + this.isEvenOrOdd(this.number));
    };
 


    public boolean isPrime(int number){
        boolean flag = true;
        if (number <= 1) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    // Runnable for prime check
    public Runnable primeTask = () -> {
        System.out.println(number + " is prime: " + this.isPrime(this.number));
    };


    public boolean isArmstrong(int number){
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return original==sum;
    }
 
    // Runnable for Armstrong number check
    public Runnable armstrongTask = () -> {
        System.out.println(number + " is Armstrong: " + this.isArmstrong(this.number));
    };

    public boolean isPalindrome(int number){
        int original = number;
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return original==reverse;
    }
 
    // Runnable for palindrome check
    public Runnable palindromeTask = () -> {
        System.out.println(number + " is palindrome: " + this.isPalindrome(this.number));
    };
 

    public int factorial(int number){
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            ans *= i;
        }
        return ans;
    }

    // Runnable for factorial calculation
    public Runnable factorialTask = () -> {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + this.factorial(this.number));
    };
 

    public int reverse(int number){
        int num = 0;
        int temp = number;
        while (temp != 0) {
            num = num * 10 + temp % 10;
            temp /= 10;
        }
        return num;
    }

    // Runnable for reverse calculation
    public Runnable reverseTask = () -> {
        System.out.println("Reverse of " + number + ": " + this.reverse(this.number));
    };

}
