package org.tnsif.acc.c2tc.finalkeyworddemo;

class ImplementByHema
{
	public void show()
	{
		System.out.println("AI integration done by Hema");
	}
}

class Vishu extends ImplementByHema
{
	public void show()
	{
		System.out.println("AI integration done by Vishu");
	}
}

public class FinalClassDemo {

	public static void main(String[] args) {
		
		ImplementByHema obj1 = new ImplementByHema();
		obj1.show();
		
		Vishu obj2 = new Vishu();
		obj2.show();

	}

}