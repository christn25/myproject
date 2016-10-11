package myproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

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
		System.out.println("Cookiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiies !!!");
		System.out.println("Et je vous déconseille la mousse au chocolat du patron");
		System.out.println("OOOOh non !! C'est dégueulasse !! Merde !!");
		System.out.println("Cookiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiies !!!");
		
		String chaine="";
		String fichier ="fichiertexte.txt";
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
				chaine+=ligne+"\n";
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}  
	}
}

//PRESENT !!!!!!!!!!!!!!!!!!