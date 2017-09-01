import java.util.ArrayList;

public class MovieTitle{
	Word[] wordsInTitle;
	
	public Word[] getWordsInTitle() {
		return wordsInTitle;
	}

	public MovieTitle(String line) {
		//Split words
		String[] words = line.split(" ");
		wordsInTitle = words;
	}
	
}
