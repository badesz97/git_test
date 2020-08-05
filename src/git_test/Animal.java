package git_test;

public abstract class Animal {

	public abstract String getName();
	public abstract void setName(String name);
	
	public abstract int getSpeed();
	public abstract void setSpeed(int speed);
	
	public abstract int getHealth();
	public abstract void setHealth(int health);
	
	public abstract int getPower();
	public abstract void setPower(int power);
	
	@Override
	public String toString() {
		return "Animal [getName()=" + getName() + ", getSpeed()=" + getSpeed() + ", getHealth()=" + getHealth()
				+ ", getPower()=" + getPower() + "]";
	}
	
	
	
}
