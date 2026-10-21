import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarExample {
    	public static void main(String args[]) {
        	GregorianCalendar calendar = new GregorianCalendar();

        	System.out.println("Current Year: " + calendar.get(Calendar.YEAR));
        	System.out.println("Current Month (0-based): " + calendar.get(Calendar.MONTH));
        	System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
       		System.out.println("Time: " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        	int currentYear = calendar.get(Calendar.YEAR);
        	if (calendar.isLeapYear(currentYear)) {
            		System.out.println(currentYear + " is a Leap Year.");
       		} else {
            		System.out.println(currentYear + " is not a Leap Year.");
        	}

        	GregorianCalendar customCalendar = new GregorianCalendar(2028, Calendar.FEBRUARY, 29);
        	System.out.println("\nChecking Custom Date: 29-Feb-2028");
        	System.out.println("Is 2028 a leap year? " + customCalendar.isLeapYear(2028));
    	}
}