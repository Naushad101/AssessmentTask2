package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalculationService;

@RestController
public class CalculationController {
    
    @Autowired
    CalculationService calculationService;

    @GetMapping("/run")
    public void getAllres(){
        Thread[] threads = {new Thread(calculationService.squareTask),new Thread(calculationService.cubeTask),
                            new Thread(calculationService.factorialTask),new Thread(calculationService.armstrongTask),
                            new Thread(calculationService.palindromeTask),new Thread(calculationService.evenTask),
                            new Thread(calculationService.primeTask),new Thread(calculationService.reverseTask)};

                for(Thread thread : threads){
                    thread.start();
                }
    }


}
