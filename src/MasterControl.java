import java.util.ArrayList;

public class MasterControl {

	public static void main(String[] args) {
		// get input
		Input input = new Input();
		input.getInput();
		
		// apply circular shift to input
		ArrayList<MovieTitle> movieTitles = input.getMovieTitles();
		ArrayList<WordToIgnore> wordsToIgnore = input.getWordsToIgnore();

		CircularShift cs = new CircularShift();
		ArrayList<Line> lines = cs.applyShift(movieTitles, wordsToIgnore);
		
		// alphabetize circularly shifted lines
		Alphabetizer alpha = new Alphabetizer();
		ArrayList<Line> sortedLines = alpha.sort(lines);
		
		// display output
		Output output = new Output();
		output.print(sortedLines);
	}

}
