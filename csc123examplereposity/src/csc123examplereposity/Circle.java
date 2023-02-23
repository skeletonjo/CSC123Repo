
//Joseph Lewis jlewis157@toromail.csudh.edu
package csc123examplereposity;
import java.util.Random;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args)
	{
		Circle c = new Circle("My Circle", 20); //radius is 20 //object circle
		System.out.println(c); //print
	}
	
	public Circle(String a, int b) //circle method
	{
		double area; //variables anytime this method is called it would reset
		double circum;
		System.out.println(a + "\n");
		System.out.println("Radius: " + b);//print
		area = Math.PI * (b * b); //calculate area
		System.out.printf("Area: %.2f \n", area); //print
		circum = 2 * Math.PI *  b; //calculate circumference
		System.out.printf("Circumference : %.2f \n", circum); //print
		
	} 
}
