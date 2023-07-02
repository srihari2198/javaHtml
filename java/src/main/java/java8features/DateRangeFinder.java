package java8features;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DateRangeFinder {
    public static void main(String[] args) {
        List<LocalDate> d = Arrays.asList(
                LocalDate.of(1998, 4, 1),
                LocalDate.of(2024, 6, 5),
                LocalDate.of(2024, 6, 6),
                LocalDate.of(2023, 7, 2)
        );

        System.out.println("Earliest Date: " + d.stream()
                .min(LocalDate::compareTo));
        System.out.println("Latest Date: " + d.stream()
                .max(LocalDate::compareTo));
    }
}