package skill.bilders;

public class Game {

	public static void main(String[] args) {
		//instant 1
		GameCharacter player1 = new GameCharacter("Hull", 100);
		
		//instant 1
		GameCharacter player2 = new GameCharacter("villain", 75);
		
		//behaver - calls a method
		player1.attack();
		
		player2.takeDamage(20);
		
		System.out.println(player1.getStatus());
		
		System.out.println(player2.getStatus());
	}

}
