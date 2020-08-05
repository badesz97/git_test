package git_test;

public class Cow {

	private String name;
	private String speed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public Cow(String name, String speed) {
		this.name = name;
		this.speed = speed;
	}
}
