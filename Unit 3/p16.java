import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateManipulationExample {
    	public static void main(String args[]) {
        	LocalDateTime currentDateTime = LocalDateTime.now();
        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        	System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        	LocalDateTime futureDate = currentDateTime.plusDays(10);
        	System.out.println("After adding 10 days:  " + futureDate.format(formatter));

        	LocalDateTime pastDate = currentDateTime.minusDays(15);
        	System.out.println("After subtracting 15 days: " + pastDate.format(formatter));

        	LocalDateTime futureMonth = currentDateTime.plusMonths(3);
        	System.out.println("After adding 3 months: " + futureMonth.format(formatter));

        	LocalDateTime pastMonth = currentDateTime.minusMonths(2);
        	System.out.println("After subtracting 2 months: " + pastMonth.format(formatter));
    	}
}