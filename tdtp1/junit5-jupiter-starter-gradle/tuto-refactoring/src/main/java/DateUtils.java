import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return isDateBetween(now, endingDate, startingDate);
    }

    public static boolean isDateBetween(LocalDate date, LocalDate endingDate, LocalDate startingDate) {
        return date.isAfter(startingDate) &&
                date.isBefore(endingDate);
    }
}