import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MasterControl {
	static final String PATH = "src/Input/";

	public static void main(String[] args) {
		// get input
		Input input = new Input();
		if (args.length > 0) {
//			System.out.println(new File(PATH + args[0]).getAbsolutePath());
//			System.out.println(new File(PATH + args[1]).getAbsolutePath());

			File movieTitlesFile = new File(PATH + args[0]);
			File wordsToIgnoreFile = new File(PATH + args[1]);
			input.getInput(movieTitlesFile, wordsToIgnoreFile);
		} else {
			input.getInput();
		}

		// apply circular shift to input
		ArrayList<MovieTitle> movieTitles = input.getMovieTitles();
		ArrayList<WordToIgnore> wordsToIgnore = input.getWordsToIgnore();
		
		CircularShift cs = new CircularShift();
		List<Line> lines = cs.applyShift(movieTitles);

		//Remove lines that begin with words to ignore
		IgnoreHelper ig = new IgnoreHelper();
		List<Line> cleanLines = ig.removeLinesToIgnore(lines, wordsToIgnore);

		// alphabetize circularly shifted lines
		Alphabetizer alpha = new Alphabetizer();
		List<Line> sortedLines = alpha.sort(cleanLines);

		// display output
		Output output = new Output();
		output.print(sortedLines);
	}

}
