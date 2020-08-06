package git_test.entities;

import git_test.abstracts.PredatorAnimal;

public class Cat extends PredatorAnimal{
	
	
	@Override
	public void setName(String name) {
		this.getName = name;
	}
	
	@Override
	public void setHealth(int health) {
		this.getHealth = health;
		
	}
	@Override
	public void setPower(int power) {
		this.getPower = power;
		
	}
	
	public Cat(String name, int health, int power) {
		this.setName(name);
		this.setHealth(health);
		this.setPower(power);
	}
	
	@Override
	public void eat() {
		System.out.println("Yummy yummy milk again slurp slurp..fuck XD");
		
	}

	@Override
	public void setIsDead(boolean value) {
		this.isDead = value;
		
	}
}
