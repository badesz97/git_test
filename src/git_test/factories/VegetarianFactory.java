package git_test.factories;

import git_test.abstracts.VegetarianAnimal;
import git_test.entities.Cow;
import git_test.entities.Horse;

public class VegetarianFactory {

	public static VegetarianAnimal getPredatorAnimal(boolean isHorse, String name, int health, int power) {
		if (isHorse) return new Horse(name, health, power);
		else return new Cow(name, health, power);
	}
}
