package git_test;

public class Cow extends Animal{
	
	public String getName;
	@Override
	public void setName(String name) {
		this.getName = name;
	}
	
	public int getHealth;
	@Override
	public void setHealth(int health) {
		this.getHealth = health;
		
	}
	
	public int getPower;
	@Override
	public void setPower(int power) {
		this.getPower = power;
		
	}
	
	public Cow(String name, int health, int power) {
		setName(name);
		setHealth(health);
		setPower(power);
	}
	
	@Override
	public void eat() {
		System.out.println("Im eating grass.");
		
	}
	
}
