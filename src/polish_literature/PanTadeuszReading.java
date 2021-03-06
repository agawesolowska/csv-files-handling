package polish_literature;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * App that read&print the excellent Polish epic poem.
 * 
 * @author Aga
 *
 */
public class PanTadeuszReading {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("pan-tadeusz.txt"))) {
			int number = 0;
			String line;
			while ((line = br.readLine()) != null) {
				number++;
				System.out.println(number + ": " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
