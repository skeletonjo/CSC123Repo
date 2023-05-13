package csc123examplereposity;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.*;
public class FileCopy {

	public static void main(String[] args) throws IOException{
		
		try {
			TreeSet<String> sets = new TreeSet<>();
			String inputFile = args[1];
			String outputFile = "";
			File old = new File(inputFile);
			Scanner oldfile = new Scanner(old);

			if(!old.exists())
			{
				System.out.println("File does not exists");
			}
			else if(old.isDirectory())
			{
				System.out.println("This is a directory");
			}
			Scanner read = new Scanner(old);
			String line = "";
			while(read.hasNext())
			{
				line = read.nextLine();
				sets.add(line);
			}
			Iterator<String> iteration = sets.iterator();
			String moreinfo = "";
			outputFile = args[0];
			File newfile = new File(outputFile);
			if(newfile.exists())
			{
				PrintWriter writer = new PrintWriter(newfile);
				
				while  (oldfile.hasNextLine())
				{
					 writer.println(oldfile.nextLine());
				}
			
				writer.close();
			}
			else
			{
				System.out.println("File already exists");
				
			}
			read.close();
			
			
			
		}catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Something went wrong");
		}
		
	}
}
