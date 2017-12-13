package org.sahil.Object.AllMethods;

public class ObjectClassDemo 
{
	static int x = 12;
	
	public static void staticMethod()
	{
		System.out.println("i m static one ");
	}
	
	public void nonstatic()
	{
		System.out.println("m non staic ");
		
		staticMethod();
		
	}

	public static void main(String[] args) {
		ObjectClassDemo object = new ObjectClassDemo();
		object.staticMethod();
		
		System.out.println("************************************");
		System.out.println("Calling Static method using class name : " );
		System.out.println("************************************");
		
		ObjectClassDemo.staticMethod();
		System.out.println("==============================");
		object.nonstatic();
	}
}
		