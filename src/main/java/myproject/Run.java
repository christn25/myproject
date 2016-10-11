package myproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import com.google.common.base.Strings;

public class Run {

	public static void main(String[] args) {
		/*System.out.println(Strings.isNullOrEmpty("Yolo"));
		System.out.println(Strings.isNullOrEmpty(""));
		System.out.println(Strings.isNullOrEmpty(null));*/
		System.out.println("Yep");
		System.out.println("Yep");
		System.out.println("Yep");
		System.out.println("Yep");
		System.out.println("Licorne");
		System.out.println("Yep");
		System.out.println("Yep");
		System.out.println("Yep");
		System.out.println("Mais pourquoi tu dis 'yep' ??");
		System.out.println("Parce que j'ai envi de dire 'yep'!");
		System.out.println("Et je vous déconseille la mousse au chocolat du patron");
		File f = new File ("textfile.txt");
		
		try {
			FileReader fr = new FileReader (f);
		}
		catch (FileNotFoundException exception) {
			System.out.println("Le fichier n'a pas été trouvé");
		}
		
	}
}

//PRESENT !!!!!!!!!!!!!!!!!!