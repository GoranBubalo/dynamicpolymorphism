package dynamicPolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// polymorphism = many shapes / forms
		// dynamic = after compilation (after runtime) 
		
		// ex. a corvette is a : corvette, and a car, and a vehicle , and a object
		
		
		//mechanism in which a call to an overridden method is to resolve at runtime rather than compile-time.
		Animal animal ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal do you want? ");
		System.out.println("1 = dog OR 2 = cat");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.speak();
		}else if(choice==2){
			animal = new Cat();
			animal.speak();
		}else {
			animal = new Animal();
			System.out.println("That choice was invalid ");
			animal.speak();
		}
		
		System.out.println("");
		

	}

}
