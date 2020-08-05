package git_test;

public class Dog {

	String name;
	int age;
	int speed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public Dog(String name, int age, int speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}

}
