package csc123examplereposity;
//joseph lewis jlewis157@toromail.csudh.edu
import java.util.Random;
public class Dice {
		public static void main(String[] args) 
		{ 
			Dice d = new Dice(); //dice object
			d.cast(); //calling dice
			System.out.println(d); //printing dice
		}
		public void cast()
		{
		    int random; //random so it will remain the same unless called on then it will change
		    Random randomNumbers = new Random(); //random
		    random = randomNumbers.nextInt(6) + 1; //random 1 through 6
		    System.out.println("Your value is: " + random);  //print
		}
}
