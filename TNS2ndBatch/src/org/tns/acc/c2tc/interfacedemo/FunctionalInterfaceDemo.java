package org.tns.acc.c2tc.interfacedemo;
@FunctionalInterface
interface InterfaceDemo2
{
    void sayHello(String Name);
}
class GreetingsImp implements InterfaceDemo2
{

	@Override
	public void sayHello(String Name) {
		System.out.println("Hello" + "   "+ Name + " !");
		
	}
	
}


public class FunctionalInterfaceDemo {
public static void main(String[] args) {
		
		InterfaceDemo2 obj=new GreetingsImp();
		obj.sayHello("Vishu");
		
	}

}
