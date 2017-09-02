import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Alphabetizer {

	Comparator<Line> lineComparator =  new Comparator<Line>() {
		@Override
		public int compare(Line l1, Line l2) {
			return l1.getFirstWord().content.compareTo(l2.getFirstWord().content);
		}
	};
	
	public List<Line> sort(List<Line> lines) {
		Collections.sort(lines, lineComparator);
		return lines;
	}
	
}
