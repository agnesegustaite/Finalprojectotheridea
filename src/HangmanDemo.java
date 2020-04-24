import java.util.Scanner; //for player input

public class HangmanDemo { //class code name
	
	public static void main(String[] args, Hangman game) { //method and the unchangeable part
		
		//1st part of text - introduction
		System.out.println("Welcome to the Hangman game!"); //introduction to the game
		System.out.println("In this game you must guess the names of some of the world's countries! Best of luck! :)");
		System.out.println("\uD83C\uDF0D"); //emoji for more interesting look console :)
		System.out.println();
		
		String word; //<--and under - variables
		char playAgain;
		int lost, won, games;
		Scanner inputScanner = new Scanner(System.in);
		
		Hangman gameHangman = new Hangman(); //declaring object "game" 
		HangmanDemo myWords = new HangmanDemo(); //declaring object "myWords"
		
		do { //asking whether the player would like to play the game
			word = myWords.getWord();
			game.hideWord(word);
			game.guessWord();
			System.out.println("Would you like to play again? (Y/N)");
			Scanner input;
			playAgain = input.next().charAt(0);
		}while (playAgain == 'Y' || playAgain == 'y');
		
		lost = games.getLost(); //<-- and under statistics should be initialized
		won = games.getWon();
		games = games.getGames();
		
		{
		
		System.out.println("Game statistics: \n" //printing the statistics
				+"Games played: \t"+games+"\n"
				+"Games won: \t"+won+"\n"
				+"Games lost: \t"+lost+"\n");
		}
}

	private String getWord() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*private String getWord();
		return null;
	}
	}//ending the main*/

}//ending the class
