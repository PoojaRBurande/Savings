package com.savings.controllers;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		a.run();
		A a1=new B();
		a1.run();
	}

}

 class A{
	public void run(){
		System.out.println("in A");
	}
}
class B extends A{
	public void run(){
		System.out.println("in B");
	}
}
