package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculationService {

    private int number;

    public CalculationService(int number) {
        this.number = number;
    }

    public int square(int number) {
        return number * number;
    }

    public Runnable squareTask = () -> {
        try {
            System.out.println("Square of number is: " + this.square(number));
        } catch (Exception e) {
            log.error("Exception occurred in squareTask: " + e.getMessage(), e);
        }
    };

    public int cube(int number) {
        return number * number * number;
    }

    public Runnable cubeTask = () -> {
        try {
            System.out.println("Cube of " + number + ": " + this.cube(this.number));
        } catch (Exception e) {
            log.error("Exception occurred in cubeTask: " + e.getMessage(), e);
        }
    };

    public boolean isEvenOrOdd(int number) {
        return number % 2 == 0;
    }

    public Runnable evenTask = () -> {
        try {
            System.out.println(number + " is even: " + this.isEvenOrOdd(this.number));
        } catch (Exception e) {
            log.error("Exception occurred in evenTask: " + e.getMessage(), e);
        }
    };

    public boolean isPrime(int number) {
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

    public Runnable primeTask = () -> {
        try {
            System.out.println(number + " is prime: " + this.isPrime(this.number));
        } catch (Exception e) {
            log.error("Exception occurred in primeTask: " + e.getMessage(), e);
        }
    };

    public boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return original == sum;
    }

    public Runnable armstrongTask = () -> {
        try {
            System.out.println(number + " is Armstrong: " + this.isArmstrong(this.number));
        } catch (Exception e) {
            log.error("Exception occurred in armstrongTask: " + e.getMessage(), e);
        }
    };

    public boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return original == reverse;
    }

    public Runnable palindromeTask = () -> {
        try {
            System.out.println(number + " is palindrome: " + this.isPalindrome(this.number));
        } catch (Exception e) {
            log.error("Exception occurred in palindromeTask: " + e.getMessage(), e);
        }
    };

    public int factorial(int number) {
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            ans *= i;
        }
        return ans;
    }

    public Runnable factorialTask = () -> {
        try {
            int factorial = this.factorial(this.number);
            System.out.println("Factorial of " + number + ": " + factorial);
        } catch (Exception e) {
            log.error("Exception occurred in factorialTask: " + e.getMessage(), e);
        }
    };

    public int reverse(int number) {
        int num = 0;
        int temp = number;
        while (temp != 0) {
            num = num * 10 + temp % 10;
            temp /= 10;
        }
        return num;
    }

    public Runnable reverseTask = () -> {
        try {
            System.out.println("Reverse of " + number + ": " + this.reverse(this.number));
        } catch (Exception e) {
            log.error("Exception occurred in reverseTask: " + e.getMessage(), e);
        }
    };
}
