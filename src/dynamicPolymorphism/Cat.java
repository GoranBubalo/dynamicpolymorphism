package dynamicPolymorphism;
//subclass
public class Cat extends Animal {
	
	@Override // overrides the speak method of Animal class
	public void speak() {
		System.out.println("Cat goes Meow");
	}

}
