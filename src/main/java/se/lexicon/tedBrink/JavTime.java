package se.lexicon.tedBrink;

import sun.util.resources.LocaleData;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavTime {



    public static void main(String[] args) {
       LocalDate nu = LocalDate.now();
       System.out.println("Ex 1: " + nu);

      String  nuDatum = nu.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
      System.out.println("Ex 2: " + nuDatum);

      LocalDate mon =  LocalDate.of(2021,6,28);

      System.out.print("Ex 3: ");
      for(int i = 0; i < 7; i++) {
          System.out.print(mon.plusDays(i) + ", ");
      }

      System.out.println();
      LocalDate vätternrundan2021 = LocalDate.parse("2021-09-04");
      System.out.println("Ex 4: vätternrundan 2021 = " + vätternrundan2021);

      LocalDate veDay = LocalDate.of(1945,5,8);
      DayOfWeek veckoDag = veDay.getDayOfWeek();
        System.out.println("Ex 5: Victory Day = " + veckoDag);

      LocalDate datumFram = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println("Ex 6: månad 10 år framåt minus 10 månader = " + datumFram.getMonth());

      LocalDate birthDay = LocalDate.of(1963,03,16);
      Period period = Period.between(veDay, birthDay);
      int years = period.getYears();
      int months = period.getMonths();
      int days = period.getDays();
      System.out.println("Ex 7: " + years + " years " + months + " months " + days + " days ");

      period = Period.of(4, 7, 29);
      LocalDate datumNu = LocalDate.now();
      LocalDate datumPlus = datumNu.plus(period);
      System.out.println("Ex 8: " + datumPlus);

      LocalTime tidNu = LocalTime.now();
      System.out.println("Ex 9: " + tidNu);

      







    }
}
