import java.time.LocalDate;

public class SimpleClass {
    public static void main(String[] args) {
        new SimpleClass().add(1, 2);
    }

    /**
     * Adds a and b
     * @param a the first number
     * @param b the second number
     */
    public int add(int a, int b) {
        return a + b;
    }

    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate)
    {
        LocalDate now = LocalDate.now();
        return isDateBetween(now, endingDate, startingDate);
    }

    private static boolean isDateBetween(LocalDate date, LocalDate endingDate, LocalDate startingDate) {
        return date.isAfter(startingDate) &&
                date.isBefore(endingDate);
    }

}


