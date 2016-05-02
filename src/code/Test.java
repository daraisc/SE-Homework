package code;
import static org.junit.Assert.*;

import org.junit.Assert;

import code.*;

public class Test {

	@org.junit.Test
	public void test() {
		Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);   
        String result=c1.statement();
        String expected = "Rental Record for joe"+"\n";
        expected += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expected += "\t" + "movie1" + "\t" + "\t" + "10" + "\t" + "30.0" + "\n";
        expected += "\t" + "movie2" + "\t" + "\t" + "5" + "\t" + "4.5" + "\n";
        expected += "Amount owed is 34.5\n";
        expected += "You earned 3 frequent renter points";
        Assert.assertTrue(expected.equals(result));
	}

}
