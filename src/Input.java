import java.util.ArrayList;

public class Input {
	ArrayList<MovieTitle> movieTitles = new ArrayList<MovieTitle>();
	ArrayList<WordToIgnore> wordsToIgnore = new ArrayList<WordToIgnore>();
	
	public ArrayList<MovieTitle> getMovieTitles() {
		return movieTitles;
	}

	public ArrayList<WordToIgnore> getWordsToIgnore() {
		return wordsToIgnore;
	}

	public static void getInput() {
		
		//ask for input of movie titles 
		inputMovieTitles();
		//ask for input of words to ignore
		inputWordsToIgnore();
	}

	private static void inputWordsToIgnore() {
		// TODO Auto-generated method stub
		
	}

	private static void inputMovieTitles() {
		// TODO Auto-generated method stub
		
	}

}
