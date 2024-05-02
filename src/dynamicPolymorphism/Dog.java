package dynamicPolymorphism;
//subclass
public class Dog extends Animal {
	
	@Override // overrides the speak method of Animal class
	public void speak() {
		System.out.println("Dog goes bark");
	}
}
