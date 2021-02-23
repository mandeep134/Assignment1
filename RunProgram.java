import java.util.Scanner; // Import the Scanner class
import java.util.Random;
import java.lang.Math;
public class RunProgram{
	public static void main(String[] args){
		new GameManager().RunGame();
	}
}
class GameManager{
	public void RunGame() {
		System.out.println("Let's play a game, You guess a number.");
		System.out.println("If your number is within 50 of my number, you will win a fabulous prize!");
		
		ManageUserInteractions user = new ManageUserInteractions();
		user.GatherUserInput();
		System.out.println("Username is: "+ user.userName);
		System.out.println("age is: "+ user.age);
		GameEngine ge = new GameEngine(user.userName, user.age);
		System.out.println("the winner is "+ ge.PlayGame());

	}
}



class ManageUserInteractions{
	String userName;
	int age;
	
	public void GatherUserInput(){
		boolean ValidInput = false;
		 Scanner myObj = new Scanner(System.in); // create a Scanner object
	System.out.println("Enter username");
	userName = myObj.nextLine(); // Read user input

	while(true){
		if (ValidInput) break;
		System.out.println("Enter age");
		try{
			age= Integer.parseInt(myObj.nextLine());
			ValidInput = true;}
			catch(Exception e){
				ValidInput = false;
				System.out.println("Enter a valid integer for age!");
			}

		}
	}
	}
class GameEngine{
	String playerName;
	int playerAge;
	int playersGuess;
	Random rand = new Random();
	int ComputersNumber;
	
	public GameEngine(String gamePlayerName, int GamePlayerAge) {
		playerName = gamePlayerName;
		playerAge = GamePlayerAge;
		
	}
	public String PlayGame() {
		playersGuess = promptUserForTheirGuess();
		ComputersNumber = rand.nextInt(100);
		System.out.println("Computer's number is"+ ComputersNumber);
		return determineTheWinner();
		
		
		
	}
	private String determineTheWinner() {
		if(Math.abs(playersGuess = ComputersNumber)<50) return "Player";
		return "Computer";
	}
	private int promptUserForTheirGuess() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your Guess:");
		return(Integer.parseInt(myObj.nextLine()));
	}
}
	
