import java.util.ArrayList;

public class WarmUpListCountOccurances {

												// [aa,aa,bb,jj,uu]
	public static int countOccurance(ArrayList<String> list, String word) {

		int count = 0;
		for (String str : list) {
			if (str.equals(word)) {
				count++;
			}

		}
		return count;
	}
}