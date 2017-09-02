import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	ArrayList<MovieTitle> movieTitles = new ArrayList<MovieTitle>();
	ArrayList<WordToIgnore> wordsToIgnore = new ArrayList<WordToIgnore>();

	public ArrayList<MovieTitle> getMovieTitles() {
		return movieTitles;
	}

	public ArrayList<WordToIgnore> getWordsToIgnore() {
		return wordsToIgnore;
	}

	public void getInput() {
		Scanner sc = new Scanner(System.in);
		// ask for input of movie titles
		System.out.println("Enter each movie title in a new line: ");
		System.out.println("(NOTE: Enter an empty title to proceed to the next step)");

		inputMovieTitles(sc);
		// ask for input of words to ignore
		System.out.println("Enter each 'word to ignore' in a new line: ");
		System.out.println("(NOTE: Enter an empty word to proceed to the next step)");

		inputWordsToIgnore(sc);
		sc.close();
	}

	public void getInput(File movieTitlesFile, File wordsToIgnoreFile) {
		try {
			Scanner movieTitlesScanner = new Scanner(movieTitlesFile);
			Scanner wordsToIgnoreScanner = new Scanner(wordsToIgnoreFile);
			// read input of movie titles
			inputMovieTitles(movieTitlesScanner);
			// read input of words to ignore
			inputWordsToIgnore(wordsToIgnoreScanner);
			movieTitlesScanner.close();
			wordsToIgnoreScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No file(s) found!");
		}
	}

	private void inputWordsToIgnore(Scanner sc) {
		// while there is a line of text, store the input in wordsToIgnore list
		while (sc.hasNextLine()) {
			String nextLine = sc.nextLine();
			if (!nextLine.isEmpty()) {
				WordToIgnore word = new WordToIgnore(nextLine);
				wordsToIgnore.add(word);
			} else {
				break;
			}
		}
	}

	private void inputMovieTitles(Scanner sc) {
		// while there is a line of text, store the input in movieTitles list
		while (sc.hasNextLine()) {
			String nextLine = sc.nextLine();
			if (!nextLine.isEmpty()) {
				MovieTitle title = new MovieTitle(nextLine);
				movieTitles.add(title);
			} else {
				break;
			}
		}

	}

}
