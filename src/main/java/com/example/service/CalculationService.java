package com.example.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
public class CalculationService{

    
    int number=153;
    public Runnable squareTask = () -> {
        int square = number * number;
        System.out.println("Square of " + number + ": " + square);
    };
 
    // Runnable for cube calculation
    public Runnable cubeTask = () -> {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    };
 
    // Runnable for even check
    public Runnable evenTask = () -> {
        boolean isEven = number % 2 == 0;
        System.out.println(number + " is even: " + isEven);
    };
 
    // Runnable for prime check
    public Runnable primeTask = () -> {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(number + " is prime: " + isPrime);
    };
 
    // Runnable for Armstrong number check
    public Runnable armstrongTask = () -> {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        boolean isArmstrong = original == sum;
        System.out.println(number + " is Armstrong: " + isArmstrong);
    };
 
    // Runnable for palindrome check
    public Runnable palindromeTask = () -> {
        int original = number;
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        boolean isPalindrome = original == reverse;
        System.out.println(number + " is palindrome: " + isPalindrome);
    };
 
    // Runnable for factorial calculation
    public Runnable factorialTask = () -> {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);
    };
 
    // Runnable for reverse calculation
    public Runnable reverseTask = () -> {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse of " + number + ": " + reverse);
    };

}
