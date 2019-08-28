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
		System.out.print("Object1 - ");
		System.out.println(pdob1);
		System.out.print("Object2 - ");
		System.out.println(pdob2);
		System.out.print("Object3 - ");
		System.out.println(pdob3);
		System.out.print("Object4 - ");
		System.out.println(pdob4);
		System.out.print("Object5 - ");
		System.out.println(pdob5);
		System.out.print("Are the birthdays of Object 1 and Object 2 the same? - ");
		System.out.println(pdob1.hasSameBirthDayAs(pdob2));
		System.out.print("Are the birthdays of Object 1 and Object 3 the same? - ");
		System.out.println(pdob1.hasSameBirthDayAs(pdob3));
		System.out.print("Are the birthdates of Object 1 and Object 3 the same? - ");
		System.out.println(pdob1.hasSameBirthDateAs(pdob3));
		System.out.print("Are the birthdays of Object 3 and Object 4 the same? - ");
		System.out.println(pdob3.hasSameBirthDayAs(pdob4));
		System.out.print("Are the birthdates of Object 3 and Object 4 the same? - ");
		System.out.println(pdob3.hasSameBirthDateAs(pdob4));
		try(PrintWriter output=new PrintWriter(new FileOutputStream(new File("output.txt"), true))){
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
			output.print("Object1 - ");
			output.println(pdob1);
			output.print("Object2 - ");
			output.println(pdob2);
			output.print("Object3 - ");
			output.println(pdob3);
			output.print("Object4 - ");
			output.println(pdob4);
			output.print("Object5 - ");
			output.println(pdob5);
			output.print("Are the birthdays of Object 1 and Object 2 the same? - ");
			output.println(pdob1.hasSameBirthDayAs(pdob2));
			output.print("Are the birthdays of Object 1 and Object 3 the same? - ");
			output.println(pdob1.hasSameBirthDayAs(pdob3));
			output.print("Are the birthdates of Object 1 and Object 3 the same? - ");
			output.println(pdob1.hasSameBirthDateAs(pdob3));
			output.print("Are the birthdays of Object 3 and Object 4 the same? - ");
			output.println(pdob3.hasSameBirthDayAs(pdob4));
			output.print("Are the birthdates of Object 3 and Object 4 the same? - ");
			output.println(pdob3.hasSameBirthDateAs(pdob4));
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}	
	}
}
