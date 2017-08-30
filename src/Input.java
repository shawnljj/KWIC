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

	public void getInput() {
		
		//ask for input of movie titles 
		inputMovieTitles();
		//ask for input of words to ignore
		inputWordsToIgnore();
	}

	private void inputWordsToIgnore() {
		// TODO Auto-generated method stub
		
	}

	private void inputMovieTitles() {
		// TODO Auto-generated method stub
		
	}

}
