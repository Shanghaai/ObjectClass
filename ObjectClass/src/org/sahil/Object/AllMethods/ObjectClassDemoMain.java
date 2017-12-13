package org.sahil.Object.AllMethods;

public class ObjectClassDemoMain 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Now we can get the all methods presents in Object class
		ObjectClassDemo o = new ObjectClassDemo();
		ObjectClassDemo o1 = new ObjectClassDemo();
		System.out.println("Static int value : "+ObjectClassDemo.x);
		
		if(o.equals(o1));
		{
			System.out.println("object are equal by using equals method");
			System.out.println("------------------------------------------------");
		} 

		Class c = o.getClass();
		System.out.println("Class to which this object belongs :"+c);
		System.out.println("----------------------------------------------------");
		
		int hashCode = o.hashCode();
		System.out.println("hashCode of the object :"+hashCode);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("when you call wait method then current thread has to wait untill it will be notify by another thread hence can't run forward");
		//o.wait();
		
		//String s = o.toString();
		System.out.println("String representation of the Object : "+o.toString().toUpperCase());
		System.out.println("--------------------------------------------------------");
	}
}
