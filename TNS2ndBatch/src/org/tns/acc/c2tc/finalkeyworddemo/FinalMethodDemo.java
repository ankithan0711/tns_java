package org.tns.acc.c2tc.finalkeyworddemo;

class calc
{
	public final void show()
	{
		System.out.println("AI integration done by hema");
	}
	
	public void add(int a ,int b)
	{
		System.out.println(a + b);
	}
}

class Advcalc extends calc
{
	public void add(int a ,int b)
	{
		System.out.println("welcome");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {

		Advcalc obj = new Advcalc();
		
		obj.show();   // final method from parent class
		obj.add(10, 20);  // overridden method
		
	}
}