package csc123examplereposity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CountriesMap {

	public static void main(String[] args) throws FileNotFoundException {
		//try
		//{
		
		
		String n = "";
		
		String t = "";
		Map<String, String> country = new TreeMap<String, String>();
		String input;
		int c = 0;
		File f = new File("C:\\Users\\jlewi\\OneDrive\\Desktop\\countries.txt");
		Scanner reader = new Scanner(f);
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Enter search string");
		input = keyboard.nextLine();
		while (reader.hasNext())
		{
			n = reader.nextLine();
			//System.out.println(n);
			//int s = Integer.parseInt(n.replaceAll("[\\D]", ""));
			//t = String.valueOf(s);
			country.put(n, t);
			System.out.println(country.get(input));
			country.values().removeAll(Collections.singleton(null));
			boolean has = country.containsKey(input.toLowerCase());
			if (has = true)
			{
				System.out.println(country.get(input.toLowerCase().indexOf(input.toLowerCase())));
			}
			
			
		}
		//<String> k = country.keySet();
		
		/*}catch (Exception r)
		{
			
		}*/
		
	}

}
