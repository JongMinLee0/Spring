package com.javalec.ex2;

import java.util.ArrayList;

public class Myinfo {
	
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public ArrayList<String> getHobby() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	public void bmiCalculator() {
		bmiCalculator.bmicalculation(weight, height);
	}
	
	public void getinfo() {
		System.out.println("이름 : "+ name);
		System.out.println("키 : "+ height);
		System.out.println("몸무게 : "+ weight);
		System.out.println("취미 : "+ hobbys);
		bmiCalculator();
	}
	
	

}
