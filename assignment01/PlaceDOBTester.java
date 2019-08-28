package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth pdob1 = new DateAndPlaceOfBirth(1999,2,4,"New York City","NY","USA");
		DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(1999,12,9,"Pune","MH","India");
		DateAndPlaceOfBirth pdob3 = new DateAndPlaceOfBirth(2002,2,4,"San Jose","CA","USA");
		DateAndPlaceOfBirth pdob4 = new DateAndPlaceOfBirth(2002,2,4,"Visby","Sweden");
		DateAndPlaceOfBirth pdob5 = new DateAndPlaceOfBirth(1989,8,28,"Bilbao","Spain");
		System.out.println(pdob1);
		System.out.println(pdob2);
		System.out.println(pdob3);
		System.out.println(pdob4);
		System.out.println(pdob5);
		System.out.print("Comparing birthday of Object 1 and Object 2: ");
		System.out.println(pdob1.hasSameBirthDayAs(pdob2));
		System.out.print("Comparing birthday of Object 1 and Object 3: ");
		System.out.println(pdob1.hasSameBirthDayAs(pdob3));
		System.out.print("Comparing birthdate of Object 3 and Object 4: ");
		System.out.println(pdob3.hasSameBirthDateAs(pdob4));
		
	}
}
