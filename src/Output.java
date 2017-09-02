import java.util.List;

public class Output {

	public void print(List<Line> sortedLines) {
		for(int i=0; i<sortedLines.size(); i++) {
			String line = sortedLines.get(i).toString();
			System.out.println(line);
		}
	}

}
