package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester{
    public static void main(String[] args){    
        DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(1995,3,6,"Seattle","WA","USA");
        StreetUSAddress addr = new StreetUSAddress("1020 Mill Creek Apts","Dixon Landing Rd","Milpitas","CA","95035");
        Person dude = new Person("Dani","Camaranesi","546-98-6400",pdob,addr);
        ComputerOwner compdude= new ComputerOwner(dude);
        Computer comp1=new Computer("Dell","i7",8,512,true,950);
		Computer comp2=new Computer("Lenovo","i7",16,3072,false,1500);
		Computer comp3=new Computer("Acer","i5",12,2048,true,1100);
        Computer comp4=new Computer("HP","i3",8,512,false,400);
        compdude.addComputer(comp1);
        compdude.addComputer(comp2);
        compdude.addComputer(comp3);
        compdude.addComputer(comp4);
        System.out.println(compdude);
        compdude.removeComputer(1);
        compdude.removeComputer(2);
        System.out.println(compdude);
        try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR ComputerOwnerTester.java:");
            ComputerOwner compdude2= new ComputerOwner(dude);
            compdude2.addComputer(comp1);
            compdude2.addComputer(comp2);
            compdude2.addComputer(comp3);
            compdude2.addComputer(comp4);
            output.println("Added 4 computers:");
            output.println(compdude2);
            compdude2.removeComputer(1);
            compdude2.removeComputer(2);
            output.println("\nRemoved 2 computers:");
            output.println(compdude2);
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}