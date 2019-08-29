package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
    public static void main(String[] args){
        SimpleDate date=SimpleDate.of(1999,12,9);
        SimpleDate laterdate=SimpleDate.of(1999,12,10);
        SimpleDate earlierdate=SimpleDate.of(1999,10,2);
        System.out.print("First date: ");
        System.out.println(date);
        System.out.print("Second date: ");
        System.out.println(laterdate);
        System.out.print("Third date: ");
        System.out.println(earlierdate);
        System.out.print("Is the first date before the second date? - ");
        System.out.println(date.before(laterdate));
        System.out.print("Is the first date before the third date? - ");
        System.out.println(date.before(earlierdate));
        System.out.print("Is the third date before the second date? - ");
        System.out.println(earlierdate.before(laterdate));
        try(PrintWriter output =new PrintWriter(new FileOutputStream(new File("output.txt"), true))) {
            output.println("\nTESTS FOR SimpleDateTester.java:");
            output.print("First date: ");
            output.println(date);
            output.print("Second date: ");
            output.println(laterdate);
            output.print("Third date: ");
            output.println(earlierdate);
            output.print("Is the first date before the second date? - ");
            output.println(date.before(laterdate));
            output.print("Is the first date before the third date? - ");
            output.println(date.before(earlierdate));
            output.print("Is the third date before the second date? - ");
            output.println(earlierdate.before(laterdate));
        } catch(FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}