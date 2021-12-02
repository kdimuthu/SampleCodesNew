package JavaSamples.Dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DatesExamples {
    public static void main(String []args) {

     /*   // Create a date object
        LocalDate myObj = LocalDate.now();
        System.out.println("Current date is "+myObj);*/

        //Display Current Date
        LocalDate.now();
        String date=LocalDate.now().toString();
        System.out.println("Date after converting to string is "+date);
        System.out.println("Current Date is :"+LocalDate.now());

        //Display Current Time
        LocalTime.now();
        System.out.println("Current Time is :"+LocalTime.now());

        //Display Current Date and Time
        LocalDateTime.now();
        System.out.println("Current Date and Time :"+LocalDateTime.now());

        //Get the end date of current month
        LocalDate EndDateOfCurrentMonthBeforeFormat=LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("End Date of Current Month is :"+EndDateOfCurrentMonthBeforeFormat);

        //Get the end date of current year
        LocalDate EndDateOfCurrentYearBeforeFormat=LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println("End Date of Current Year is :"+EndDateOfCurrentYearBeforeFormat);

        //Change the Format the date
        String EndDateOfCurrentMonth = EndDateOfCurrentMonthBeforeFormat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Month End Date after formatted :"+EndDateOfCurrentMonth);

        //How to add a month(30 days) to current date
        LocalDate day=LocalDate.now().plusMonths(1);
        System.out.println("Date after adding 30 days from current date :"+day);

        //Get the current date & Time
        Date today = new Date();
        System.out.println("Current Date is :"+today);

        //Get the formatted current date for the given format with AM PM
        SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy h:mm aa");
        //September 1, 2021 3:21 PM
        Date now = new Date();
        String strDate = format.format(now);
        System.out.println("Formatted Current date is "+strDate);
        Date todayInDifferentWay = Calendar.getInstance().getTime();
        System.out.println("Current Date is(same date in using a different way :"+todayInDifferentWay);

    }
}
