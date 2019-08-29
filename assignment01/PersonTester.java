package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester{
    public static void main(String[] args){    
        DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(1999,2,4,"New York City","NY","USA");
        StreetUSAddress addr = new StreetUSAddress("Apt 104B","Hillside Residence","Vestal","NY","13902");
        Person dude =new Person("Rutvik","Saptarshi","103-98-0126",pdob,addr);
        System.out.println(dude);
        try(PrintWriter output=new PrintWriter(new FileOutputStream(new File("output.txt"),true))){
            output.println("\nTESTS FOR Person.java");
            output.println(dude);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}