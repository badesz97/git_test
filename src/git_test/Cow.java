package git_test;

public class Cow extends Animal{
	
	private String name;
	private int health;
	private int power;

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getHealth() {
		return 150;
	}
	@Override
	public void setHealth(int health) {
		this.health = health;
		
	}
	@Override
	public int getPower() {
		return 40;
	}
	@Override
	public void setPower(int power) {
		this.power = power;
		
	}
	
	public Cow(String name, int health, int power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}

	@Override
	public void eat() {
		System.out.println("Damn this grass tastes so good...");
		
	}
	
}
