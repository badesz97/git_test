package git_test;

public class Horse {

	String name;
	int age;
	int horseSpeed;
	
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
	public int getHorseSpeed() {
		return horseSpeed;
	}
	public void setHorseSpeed(int horseSpeed) {
		this.horseSpeed = horseSpeed;
	}
	public Horse(String name, int age, int horseSpeed) {
		this.name = name;
		this.age = age;
		this.horseSpeed = horseSpeed;
	}
	@Override
	public String toString() {
		return "Horse [name=" + name + ", age=" + age + ", horseSpeed=" + horseSpeed + "]";
	}
	
	
}
