package git_test;

public abstract class Animal {

	public abstract String getName();
	public abstract void setName(String name);
	
	public abstract int getHealth();
	public abstract void setHealth(int health);
	
	public abstract int getPower();
	public abstract void setPower(int power);
	
	public abstract void eat();
	
	@Override
	public String toString() {
		return "Animal [getName()=" + getName() + ", getHealth()=" + getHealth()
				+ ", getPower()=" + getPower() + "]";
	}
	
	
	
}
