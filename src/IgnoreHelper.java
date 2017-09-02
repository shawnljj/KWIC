import java.util.ArrayList;
import java.util.List;

public class IgnoreHelper {

	public List<Line> removeLinesToIgnore(List<Line> lines, ArrayList<WordToIgnore> wordsToIgnore) {
		List<Line> linesToReturn = new ArrayList<Line>();

		for (Line l : lines) {
			String firstWord = l.getFirstWord().getContent();
			boolean shouldIgnore = false;
			for (WordToIgnore wig : wordsToIgnore) {
				String ignore = wig.getContent();
				if (firstWord.equalsIgnoreCase(ignore)) {
					shouldIgnore = true;
					break;
				} else {
					// do nothing
				}
			}
			if (!shouldIgnore) {
				linesToReturn.add(l);
			}
		}

		return linesToReturn;
	}
}
