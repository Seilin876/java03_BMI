package com.example.basichw03;


import java.math.BigDecimal;
import java.util.Scanner;

public class BMI { private double BMI,H,W = 0;
    private Scanner scanner = new Scanner(System.in);


    public void  getHight(){
        System.out.println("enter your height");
        H = scanner.nextDouble();
    }
    public void  getWight(){
        System.out.println("enter your weight");
        W = scanner.nextDouble();
    }
    public  void BMIAns(){
        BMI = W/((H*H)/10000);
        BigDecimal BD = new BigDecimal(BMI);
        double ValueT2D = BD.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("your bmi is "+ValueT2D);
    }

}