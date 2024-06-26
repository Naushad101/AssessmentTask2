package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalculationService;

@RestController
public class CalculationController {
    

   private CalculationService calculationService;
    

    public CalculationController(CalculationService calculationService){
        this.calculationService=calculationService;
    }


    @PostMapping("/square")
    public int square(@RequestParam("num") int n){
        return calculationService.square(n);
    }

    @PostMapping("/cube")
    public int cube(@RequestParam("num") int n){
        return 0;
    }

    @PostMapping("/isEvenOrOdd")
    public int isEvenOrOdd(@RequestParam("num") int n){
        return 0;
    }

    @PostMapping("/isPrimeOrNot")
    public int isPrimeOrNot(@RequestParam("num") int n){
        return 0;
    }


    @PostMapping("/isArmstrong")
    public int isArmstrong(@RequestParam("num") int n){
        return 0;
    }

    @PostMapping("/isPalindromOrNot")
    public int isPalindromOrNot(@RequestParam("num") int n){
        return 0;
    }

    @PostMapping("/reverse")
    public int factorial(@RequestParam("num") int n){
        return 0;
    }



}
