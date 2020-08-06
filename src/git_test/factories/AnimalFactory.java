package git_test.factories;

import git_test.abstracts.Animal;
import git_test.enums.AnimalType;

public class AnimalFactory {

	public static Animal getAnimal(AnimalType atype, boolean isDogOrHorse, String name, int health, int power) {
		switch(atype) {
			case Predator: return PredatorFactory.getPredatorAnimal(isDogOrHorse, name, health, power);
			case Vegetarian: return VegetarianFactory.getPredatorAnimal(isDogOrHorse, name, health, power);
		}
		return null;
	}
}
