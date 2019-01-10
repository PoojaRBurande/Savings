package com.sharada.shape;

public class Rectangle implements Shape{
	public void draw(){
		System.out.println("Drawing rectangle .....");
	}
	public void myInit(){
		System.out.println("in init method");
	}
	public void destroy(){
		System.out.println("in destroy methdo");
	}
}
