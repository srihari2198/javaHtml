package java8features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDaysCalculator {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 7, 3); // Replace with your specific date

        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        System.out.println(endDate);
        int workingDays = 0;
        LocalDate i = startDate;
        while (i.isBefore(endDate) || i.isEqual(endDate)) {
            if (i.getDayOfWeek() != DayOfWeek.SATURDAY && i.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            i = i.plus(1, ChronoUnit.DAYS);
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}

