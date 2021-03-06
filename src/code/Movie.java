package code;
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    private Price price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public String getTitle (){
        return title;
    }
	double getCharge(int daysRented) {
	    double thisAmount = 0;
	    switch (getPriceCode()) {
	        case Movie.REGULAR:
	            thisAmount += 2;
	            if (daysRented > 2)
	                thisAmount += (daysRented - 2) * 1.5;
	            break;
	        case Movie.NEW_RELEASE:
	            thisAmount += daysRented * 3;
	            break;
	        case Movie.CHILDRENS:
	            thisAmount += 1.5;
	            if (daysRented > 3)
	                thisAmount += (daysRented - 3) * 1.5;
	            break;
	    }
	    return thisAmount;
	}
	int getFrequentRenterPoints(int daysRented) {
		 if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
		 return 2;
		 else
		 return 1;
		 }

}