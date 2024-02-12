package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    int frequentRenterPoints() {
        return 1 + addBonusForATwoDaysNewReleaseRental();
    }

    int addBonusForATwoDaysNewReleaseRental() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            return 1;
        return 0;
    }

    double determineAmounts() {

        switch (getMovie().getPriceCode()) {

            case Movie.NEW_RELEASE:
                return getDaysRented() * 3;
            case Movie.CHILDRENS:
                double thisAmount = 1.5;
                if (getDaysRented() > 3)
                    thisAmount += (getDaysRented() - 3) * 1.5;
                return thisAmount;
        }

        if (getMovie().getMoviePriceCode() == MoviePriceCode.REGULAR) {
            getMovie().getMoviePriceCode().getComputeAmount().apply(getDaysRented());
        }
        return 0;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}
