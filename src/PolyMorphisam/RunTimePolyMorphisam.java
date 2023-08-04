package PolyMorphisam;

public class RunTimePolyMorphisam {
	//
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dog1 = new Dog();
		Dog dog2 = new Dog();

		animal.makeSound(); // Output: Generic animal sound
		dog1.makeSound(); // Output: Woof!
		dog2.makeSound(); // Output: Woof!
	}
}

class Animal {
	void makeSound() {
		System.out.println("Generic animal sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Woof!");
	}
}
