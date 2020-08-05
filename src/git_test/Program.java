package git_test;


/*
 * 
 * Change BC
 * 
 */
public class Program {

	public static void main(String[] args) {

		Animal a1 = new Dog("Rocky", 100, 21);
		Animal a2 = new Cat("Tom", 60, 20);
		
		gameControl(a1, a2);
	}
	
	public static void gameControl(Animal a1, Animal a2) {
		System.out.println("=== BEGIN FIGHT ===");
		int round = 0;
		
		do {
			round += 1;
			System.out.println("\n\n"+ round);
			System.out.println("[" + a1.getName +":" + a1.getHealth + "|" + a2.getName +":" + a2.getHealth + "]\n");
			a1.attack(a2);
			a2.attack(a1);
			System.out.println(a1.getName +  " ---punched--> " + a2.getName + " with power: " + a1.getPower+"\n"
			+ a2.toString() + a2.isDead);
			
			System.out.println(a2.getName +  " ---punched--> " + a1.getName + " with power: " + a2.getPower+"\n"
			+ a1.toString() + a1.isDead);
		}
		while(!a1.isDead && !a2.isDead);
		
		System.out.println("\n");
		System.out.println(a1.toString() +" dead?:" + a1.isDead);
		System.out.println(a2.toString() +" dead?:" + a2.isDead);
		
		System.out.println("=== END OF FIGHT ===\nWinner is: ");
		if (a1.isDead == true) {
			System.out.println(a2.toString());
		}
		else {
			System.out.println(a1.toString());
		}
	}
}
