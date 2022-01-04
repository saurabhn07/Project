package com.mph.model;

public class CalculatorModel
{
	   int num1;
	   int num2;
	   float result;
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
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Controller [num1=" + num1 + ", num2=" + num2 + ", result=" + result + "]";
	}
	public CalculatorModel(int num1, int num2, float result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}
	public CalculatorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
   
}
