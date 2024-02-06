import java.time.LocalDate;

public class SimpleClass {
    public static void main(String[] args) {
        new SimpleClass().add(1, 2);
        DateUtils.isNowBetween(LocalDate.MIN, LocalDate.MAX);
        DateUtils.isDateBetween(LocalDate.of(2019, 1, 1), LocalDate.MIN, LocalDate.MAX);
    }

    /**
     * Adds a and b
     * @param a the first number
     * @param b the second number
     */
    public int add(int a, int b) {
        return a + b;
    }


}


