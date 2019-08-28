package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester{
	public static void main(String[] args){
		StreetUSAddress addr1 = new StreetUSAddress("Apt 104B","Hillside Residence","Vestal","NY","13902");
		StreetUSAddress addr2 = new StreetUSAddress("Broadway","","New York City","NY","27505");
		System.out.println("Address 1:");
		System.out.println(addr1);
		System.out.println("\nAddress 2:");
		System.out.println(addr2);
		try(PrintWriter output=new PrintWriter(new FileOutputStream(new File("output.txt"),true))){
			output.println("\nTESTS FOR StreetUSAddress.java");
			output.println("Address 1:");
			output.println(addr1);
			output.println("\nAddress 2:");
			output.println(addr2);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
