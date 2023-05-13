package csc123examplereposity;
//joseph lewis jlewis157@toromail.csudh.edu
import java.util.Scanner;
public class Person {
	//Fields
		private String firstName;
		private String lastName;
		private String emailAddress;
		private String ssn;
		private int id;
		private int accnumber;
		private int input;
		
		//Constructors
		public Person(String fName, String lName, int id, String SSN, String email) {
			
			
			this.firstName= fName;
			this.lastName=lName;
			this.emailAddress=email;
			this.ssn=SSN;
			this.id=id;
		}

		//Methods
		public void setFirstName(String firstName)
		{
				this.firstName = firstName;
		}
		
		public void setlastName(String lastName)
		{
				this.lastName = lastName;
		}
		
		public void setsnn(String snn)
		{
				this.ssn = ssn;
		}
		
		public void setid(int id)
		{
				this.id = id;
		}
		public  String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public String getSSN() {
			return ssn;
		}



		public String toString() {
			return id+":"+firstName+":"+lastName+":"+emailAddress+":"+ssn;
		}
		
		
		
}
