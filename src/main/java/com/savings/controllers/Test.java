package com.savings.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void main(String args[]) throws Exception{
	
		
		List l1=new ArrayList<>();
		l1.add(50);
		Iterator itr=l1.iterator();
		
		System.out.println(l1.get(3));
		while(itr.hasNext()){
			System.out.println(itr.next());
			//l1.add(50);
		}
		/*Set s=new HashSet();
		
		s.add(null);
		s.add(5);
		
		Iterator r=s.iterator();
		
		while(r.hasNext()){
			System.out.println(r.next());
		}*/
		/*Test t=new Test();
		t.method();*/
		/*Thread.sleep(70);
		System.out.println("Thread");
		*/
		/*float f1=10.20f;
		float f2=10.20f;
		System.out.println(f1==f2);
		
		StringBuffer s1=new StringBuffer("Pooja");
		StringBuffer s2=new StringBuffer("Pooja");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
	}
	public static void method(){
		System.out.println("AB");
	}
}
