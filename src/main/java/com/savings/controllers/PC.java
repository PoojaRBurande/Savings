package com.savings.controllers;

import java.util.LinkedList;

public class PC {
	LinkedList<Integer> list=new LinkedList<>();
	int capacity =2;
	
	public void produce() throws InterruptedException {
		// TODO Auto-generated method stub
		boolean a;
		int value=0;
		while(true){
			synchronized (this) {
			while(list.size()==capacity)	
				wait();
				System.out.println("Producer Produced -"+value);
				list.add(value++);
			notify();
			Thread.sleep(1000);
			
		}
	}
}
	
	public void consume() throws InterruptedException {
		// TODO Auto-generated method stub
		while(true){
			synchronized (this) {
				
				while(list.size()==0)
					wait();
				int val=list.removeFirst();		
				System.out.println("Consumer consumed -"+val);
				notify();
				Thread.sleep(1000);
				
			}
		}
	}
}
