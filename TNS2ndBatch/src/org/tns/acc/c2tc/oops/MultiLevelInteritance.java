package org.tns.acc.c2tc.oops;

public class MultiLevelInteritance {

	class Animal1
	{
		void eat()
		{
			System.out.println("Animal is eating");
		}
	}
	class Mammals extends Animal1
	{
		void sleep()
		{
			System.out.println("Mammal is sleeping");
		}
	}
	class Dog1 extends Mammals
	{
		void bark()
		{
			System.out.println("Dog is barking");
		}
		
	} 
}
