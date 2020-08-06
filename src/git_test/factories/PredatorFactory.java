package git_test.factories;

import git_test.abstracts.PredatorAnimal;
import git_test.entities.Cat;
import git_test.entities.Dog;

public class PredatorFactory {

	public static PredatorAnimal getPredatorAnimal(boolean isDog, String name, int health, int power) {
		if (isDog) return new Dog(name, health, power);
		else return new Cat(name, health, power);
	}
}
