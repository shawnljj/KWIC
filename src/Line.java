public class Line {
	Word[] words;
	
	public Line(Word[] words) {
		this.words = words;
	}
	
	public Word getFirstWord() {
		return words[0];
	}
	
	public String toString() {
		String returnString = "";
		for(Word w:words) {
			returnString += w.getContent() + " ";
		}
		return returnString.trim();
	}
}
