package polish_literature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * App that sort&write the excellent Polish epic poem.
 * 
 * @author Aga
 *
 */
public class PanTadeuszSortingAndWriting {

	public static void main(String[] args) {

		try {
			List<String> lines = Files.readAllLines(Paths.get("pan-tadeusz.txt"));
			lines.sort((l1, l2) -> l1.length() - l2.length());
			Files.write(Paths.get("pan-tadeusz-sort.txt"), lines);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
