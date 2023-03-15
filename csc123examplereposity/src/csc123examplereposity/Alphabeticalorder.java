package csc123examplereposity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Alphabeticalorder {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("C:\\Users\\jlewi\\OneDrive\\Desktop\\myfile.txt"); //file
		Scanner reader = new Scanner(f);                                    //scan
		Map<Character, String> map=new TreeMap<Character, String>();  //hashmap
		while (reader.hasNextLine())                                        //loop every line
		{
			String s = reader.nextLine();                                  //save to s
			for (char a : s.toCharArray() )
			{
				map.put(a, s);                //loop and adding characters to a and lines to s
			}
			
		}
		File z = new File("C:\\Users\\jlewi\\OneDrive\\Desktop\\myfile.txt");
		if(!z.getParentFile().exists()) {
			z.getParentFile().mkdirs();
			
		}
		PrintWriter writer = new PrintWriter("C:\\Users\\jlewi\\OneDrive\\Desktop\\newfile2.txt");
		Set<Character> keys = map.keySet();
		for (Character t : keys)                  //only printing keys
		{
			System.out.print(t);        //only printing character
			writer.println(t + "\n");
		}
		writer.close();
		
		
		}
		

	}


