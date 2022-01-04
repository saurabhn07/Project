package com.mph.controller;

import com.mph.model.CalculatorModel;
import java.util.Scanner;
public class Controller 
{   
	 public void add() 
	 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first number");
	 int num1= sc.nextInt();
	 System.out.println("Enter second number");
	 int num2= sc.nextInt();
	 //System.out.println("Enter first number");
	 float res= num1+num2;
	 System.out.println("The addition result is "+res);
	 }
	 
	 public void substract() 
	 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first number");
	 int num1= sc.nextInt();
	 System.out.println("Enter second number");
	 int num2= sc.nextInt();
	 //System.out.println("Enter first number");
	 float res= num1-num2;
	 System.out.println("The substraction result is "+res);
	 }
	 
	 public void mult() 
	 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first number");
	 int num1= sc.nextInt();
	 System.out.println("Enter second number");
	 int num2= sc.nextInt();
	 //System.out.println("Enter first number");
	 float res= num1*num2;
	 System.out.println("The multiplication result is "+res);
	 }
	 
	 public void divide() 
	 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first number");
	 int num1= sc.nextInt();
	 System.out.println("Enter second number");
	 int num2= sc.nextInt();
	 //System.out.println("Enter first number");
	 float res= num1/num2;
	 System.out.println("The division result is "+res);
	 }
}
