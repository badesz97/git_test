package git_test;

public abstract class Animal {

	public String getName;
	public abstract void setName(String name);
	
	public int getHealth;
	public abstract void setHealth(int health);
	
	public int getPower;
	public abstract void setPower(int power);
	
	public abstract void eat();
	
	public void attack(Animal other) {
		other.loseHealth(getPower);
	}
	
	public void loseHealth(int power) {
		setHealth(getHealth - power);
	}
	
	@Override
	public String toString() {
		return "Animal [getName()=" + getName + ", getHealth()=" + getHealth
				+ ", getPower()=" + getPower + "]";
	}
	
	
	
}
