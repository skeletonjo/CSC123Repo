package csc123examplereposity;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FiletoNewFile {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		String filecont = "";
		String dnewfile = "";
		String fname = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter file name");
		fname = keyboard.nextLine();
		System.out.println("What would you like to call your new file");
		dnewfile = keyboard.nextLine();
		File g = new File(dnewfile);
		File f=new File(fname);
		Scanner dfile = new Scanner(f);
		
		if (f.exists() == false  || g.exists() == true)
		{
			System.out.println("File does not exist");
			System.exit(0);
		}
		
		if(!g.getParentFile().exists()) {
			g.getParentFile().mkdirs();
			
		}
		
		PrintWriter writer = new PrintWriter(dnewfile);
		
		while  (dfile.hasNextLine())
		{
			 writer.println(dfile.nextLine());
		}
	
		writer.close();
		
			

	}

}
