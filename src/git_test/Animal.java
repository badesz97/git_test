package git_test;

public abstract class Animal {

	public boolean isDead;
	
	public abstract void setIsDead(boolean value);
	
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
		if (getHealth - power > 0) setHealth(getHealth - power);
		else setIsDead(true);
	}
	
	@Override
	public String toString() {
		return "Animal [Name=" + getName + ", Health=" + getHealth
				+ ", Power=" + getPower + "]";
	}
	
	
	
}
