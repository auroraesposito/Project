package lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Scrivere {

	public static void main(String[] args) {

		String[] note = {
				"do",
				"re",
				"mi",
				"fa",
				"sol",
				"la",
				"si",
		};
		
		File f = new File("C:\\Users\\sviluppo.EDU-IL\\Desktop\\note.txt");
		
		try {//Stream legge caratteri e non
			PrintStream ps = new PrintStream(f);
			
			for (String nota : note) {
				ps.println(nota);
			}
			
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
