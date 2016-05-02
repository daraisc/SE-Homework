package code;
import java.lang.*;
import java.util.*;
/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program
{
    /**
     * This is the main entry point for the application
     */
    
    
    public static void main(String args[]) 
    {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);   
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
        
        String expected = "Rental Record for joe \n";
        expected += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expected += "\t" + "movie1" + "\t" + "\t" + "10" + "\t" + "30.0" + "\n";
        expected += "\t" + "movie2" + "\t" + "\t" + "5" + "\t" + "4.5" + "\n";
        expected += "Amount owed is 34.5\n";
        expected += "You earned 3 frequent renter points";
        System.out.println(expected);
        if(expected==result)
        {
        	System.out.println("yay");
        }
    }
}


