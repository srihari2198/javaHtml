package java8features;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1998, 9, 21);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);

        System.out.println(age.getYears()+" years,"+age.getMonths()+" months,"+age.getDays()+" days");
    }
}
