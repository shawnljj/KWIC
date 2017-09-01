import java.util.ArrayList;

public class CircularShift {
	ArrayList<Line> linesToReturn = new ArrayList<Line>();

	public ArrayList<Line> applyShift(ArrayList<MovieTitle> movieTitles, ArrayList<WordToIgnore> wordsToIgnore) {
		// Circular shift all lines, then remove lines which begin with a wordToIgnore
		for (MovieTitle title : movieTitles) {
			// get number of words (that's the number of times to shift)
			Word[] wordsInTitle = title.getWordsInTitle();
			int numOfWords = wordsInTitle.length;

			// maintain the shifted word for all permutations
			Word[] shiftedTitle = wordsInTitle;

			for (int i = 0; i < numOfWords; i++) {
				// shift first word to the back
				// add to list of lines
				linesToReturn.add(shiftToBack(shiftedTitle));

			}
			// add to list of lines

		}
		return null;
		// TODO Auto-generated method stub

	}

	private Line shiftToBack(Word[] shiftedTitle) {
		int numOfWords = shiftedTitle.length;
		Word[] shifting = new Word[numOfWords];
		for (int i = 0; i < numOfWords; i++) {
			if (i < numOfWords - 1) {
				shifting[i] = shiftedTitle[i + 1];
			}
			if (i == numOfWords - 1) {
				shifting[i] = shiftedTitle[0];
			}
		}
		
	}

}
