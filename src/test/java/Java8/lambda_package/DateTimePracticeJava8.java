package Java8.lambda_package;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimePracticeJava8 {
    //  @Test
    public void datePractice() {
        // to get local date in a "YYYY/MM/DD" format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate localDate = LocalDate.now();
        System.out.println("local date is :" + dtf.format(localDate));
    }

    //@Test
    public void timePractice() {
        // to get local time in a "HH:mm:ss" format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println("local time is :" + dtf.format(localTime));

        Instant now = Instant.now();
        System.out.println("Testing time " + now);

    }

   // @Test
    public void timePratice2(){
    // to print timestamp
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println("Timestamp is  "+ timestamp);
}
   // @Test
    //Period
    public void localDateAndPeriod(){
        // Period- To calculate  between 2 local dates
        LocalDate from = LocalDate.of(2010,5,4);
        LocalDate to =  LocalDate.of(2020,10,9);
        Period period = Period.between(from,to);
        System.out.println(period.getYears() + " Years");
        System.out.println(period.getMonths() + " Months");
        System.out.println(period.getDays() + " Days");

    }
    @Test
    //Duration
    public void localTimeAndDuration(){
        // Period- To calculate the difference between 2 local times
        LocalDateTime from = LocalDateTime.of(2010,05,4,10,20,55);
        LocalDateTime to =  LocalDateTime.of( 2020,10,9,10,20,44);
        Duration duration = Duration.between(from,to);
        System.out.println(duration.toDays() + " Days");
        System.out.println(duration.toHours() + " Hours");
        System.out.println(duration.toMinutes() + " Minutes");
        System.out.println(duration.toSeconds() + " Seconds");

    }
}
