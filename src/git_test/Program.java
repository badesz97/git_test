package git_test;


/*
 * 
 * Change BC
 * 
 */
public class Program {

	public static void main(String[] args) {

		Animal a1 = new Dog("Rocky", 100, 20);
		Animal a2 = new Cat("Tom", 60, 20);
		
		gameControl(a1, a2);
	}
	
	public static void gameControl(Animal a1, Animal a2) {
		System.out.println("=== BEGIN FIGHT ===");
		int round = 0;
		
		while ((a1.isDead == false && a2.isDead == false)) {
			round += 1;
			System.out.println(round);
			a1.attack(a2);
			a2.attack(a1);
			System.out.println(a1.getName +  " ---punched--> " + a2.getName +"\n" + a1.toString());
			System.out.println(a2.getName +  " ---punched--> " + a1.getName +"\n" + a2.toString());
		}
		
		System.out.println(a1.isDead);
		System.out.println(a2.isDead);
		
		System.out.println("=== END OF FIGHT ===\nWinner is: ");
		if (a1.isDead == true) {
			System.out.println(a2.toString());
		}
		else {
			System.out.println(a1.toString());
		}
	}
}
