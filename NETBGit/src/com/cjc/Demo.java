package com.cjc;

public class Demo 
{
	public void m1()
	{
	System.out.println("Hello");
	}
	
	public void m2()
	{
	System.out.println("Hello==M2");
	}
	
	public void m3()
	{
	System.out.println("Hello==M3");
	}
	public void m4()
	{
	System.out.println("Hello==M4");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
