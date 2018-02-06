import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		RockPlayer rockPlayer; //FIXME
		RandomPlayer randomPlayer; //FIXME
		Player opponentPlayer; //FIXME
		
		//1. Display user prompt
		System.out.println("Please enter your name: ");
		
		
		//2. Get user name input
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		
		//3. Display "select opponent prompt"
		System.out.println("Please select Rock (1) or Random Player: (2): ");
		
		
		//4. Get user opponent choice input
		int playerType = scan.nextInt();
		
		if (playerType == 1) {
			opponentPlayer rock = new rockPlayer(); //FIXME
		} else if (playerType == 2) {
			opponentPlayer player2 = new RandomPlayer(); //FIXME
		}
		
		//5. Display user prompt for rock paper scissors
		System.out.println("Please select (R)ock, (P)aper or (S)cissors.");
		
		//6. Get user input game choice 
		String thrown = scan.nextLine();
		
		HumanPlayer humanPlayer = new HumanPlayer(); //FIXME
		HumanPlayer.setRoshambo(thrown);
		
		
		//7. Display results of match
		String results = matchResults(humanPlayer, opponentPlayer); //FIXME
		
		System.out.println(results);
		
		/*
		 * Calculate result of match and return in String method
		 */
	}

	private static void nextInt() {
		
		
	}

}
