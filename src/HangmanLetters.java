public class HangmanLetters { //class for storing the 14 words
	private String wordsArray[] = {"Albania", "Belize", "Cameroon", "Djibouti", "Kyrgyzstan", "Liberia", "Malawi", "Oman", "Paraguay", "Samoa", "Suriname", "Tuvalu", "Vanuatu", "Zambia"};
	private double index;
	
	public HangmanLetters() {
	}
	public String getWord() {
		index = Math.random()*14;
		int i = (int)index;
		return wordsArray[i];
	}
}
	

	