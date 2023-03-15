package csc123examplereposity;
import java.io.File;
import java.io.IOException;

public class ReadableFile {

	public static void main(String[] args)  {
		//try
		//{
		File f=new File("testfile.txt");
		//FileInputStream in=new FileInputStream(f);
		f.createNewFile();
		//throw new IOException("something went wrong");
		System.out.println("Exists:"+f.exists());
		

	}

}
