import java.util.ArrayList;
import java.util.List;

public class CircularShift {
	public List<Line> applyShift(ArrayList<MovieTitle> movieTitles) {
		// Circular shift all lines
		return circularShiftAllLines(movieTitles);
	}

	private List<Line> circularShiftAllLines(ArrayList<MovieTitle> movieTitles) {
		List<Line> shiftedLines = new ArrayList<Line>();

		for (MovieTitle title : movieTitles) {
			// get number of words (that's the number of times to shift)
			Word[] wordsInTitle = title.getWordsInTitle();
			int numOfWords = wordsInTitle.length;

			// maintain the shifted word for all permutations
			Word[] shiftedTitle = wordsInTitle;

			for (int i = 0; i < numOfWords; i++) {
				// shift first word to the back
				shiftedTitle = shiftToBack(shiftedTitle);
				// add to list of lines
				Line l = new Line(shiftedTitle);
				shiftedLines.add(l);
			}
		}
		
		return shiftedLines;
	}

	private Word[] shiftToBack(Word[] shiftedTitle) {
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
		return shifting;
	}

}
