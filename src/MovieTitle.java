
public class MovieTitle {
	Word[] wordsInTitle;

	public Word[] getWordsInTitle() {
		return wordsInTitle;
	}

	public MovieTitle(String line) {
		// Split words
		String[] words = line.split(" ");
		wordsInTitle = new Word[words.length];
		for (int i = 0; i < words.length; i++) {
			wordsInTitle[i] = new Word(words[i]);
		}
	}

}
