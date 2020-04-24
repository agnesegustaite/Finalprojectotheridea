import java.util.Scanner;
public class Hangman<hiddenWord, StrongBuffer> {


private String word, expandedWord; //<-- and under - private variables
private int live, gamePlayed, won, lost;
private char c;
private StringBuffer hiddenWord;

	public void HangmanDemo () {
		gamePlayed = 0;
		won = 0;
		lost = 0;
		c = ' ';
	}

	public void hidenWord(String word, String replacement, String target) {
	this.word = word;
	hiddenWord = new StringBuffer();
	for (int i=0; i<word.length(); i++) {
		hiddenWord.append("_ ");
		expandedWord = word.replace(target: "", replacement: "" ).trim);{
	}

private Object replacement(String string) {
		return null;
	}

private void progress(Scanner input, StringBuffer hiddenWord, StringBuffer lettersUsed) {
	System.out.println();
	System.out.println("Lives: "+live);
	System.out.println("Word: "+hiddenWord);
	System.out.println("Used letter: "+lettersUsed);
	System.out.println("Guess a letter: ");
	c = input.hasNext().charAt(0);
	c = Character.toLowerCase(c);
	
	if(!(Character.isLetter(c))) {
		System.out.println("\n-Invalid character was entered-");
	}
}
 
public void guessWord() {
	StringBuffer lettersUsed = new StringBuffer();
	Scanner input = new Scanner(System.in);
	int noComa = 0;
	live = 8;
	boolean compare;
	while(live > 0) {
		int i = 0;
		boolean stillAlive = false;
		compare = (!(hiddenWord.toString().trim().equals(expandedWord.trim())));
		
		if (compare == true) {
			progress(input, hiddenWord, lettersUsed);
			String char = lettersUsed.toString();
			char charArray[] = chars.toCharArray();
			while (i<charArray.length) {
				if(c == charArray[i]) {
					System.out.println("\nYou have already used: "+c);
					progress((input, hiddenWord, lettersUsed);
					i=-1;
				}
				i++;
			}
		if(noComa == 0) {
			lettersUsed.append(c)
			noComa = 1;
		}else {
			lettersUsed.append(", "+c);
		}

		for(i = O; i<expandedWord.length(); i++) {
			char k = expandedWord.charAt(i);
			if(k == c) {
				hiddenWord.setCharAt(i, c)
				stillAlive = true;
			}
		}
		if(!stillAlive) {
			live--;
		}
		
		}else {
			System.out.println("\nWord: "+hiddenWord+"\n");
			System.out.println("Congratulations! :)) You have guessed the word!");
			won++;
			break;
		}
	}
	if(!(hiddenWord.toString().trim().equals(expandedWord.trim()))) {
		System.out.println("\nSorry you have lost!");
		System.out.println("\nCorrect word was: " +word);
		lost++;
	}
	gamePlayed++;
}

public void hideWord(String word2) {

	
}

}//end of code

