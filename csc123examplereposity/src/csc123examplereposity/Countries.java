package csc123examplereposity;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Countries {
public static String w = "";
	public static void main(String[] args) throws IOException {
		String n = "";
		int c = 0;
		File f = new File("C:\\Users\\jlewi\\OneDrive\\Desktop\\countries.txt");
		Scanner reader = new Scanner(f);
		//Scanner keyboard= new Scanner(System.in);
		FileReader fe = new FileReader(f);
		/*while  (reader.hasNextLine())
		{
			n = n.concat(reader.nextLine() + "\n");
		}*/
		
		//if (n.has)
		//System.out.print(n);
		System.out.println("Enter search string");
		
		

	}

}
