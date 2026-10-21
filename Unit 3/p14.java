import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    	public static void main(String args[]) {
        	LocalDateTime currentDateTime = LocalDateTime.now();
        	LocalDate currentDate = LocalDate.now();

        	System.out.println("Default format: " + currentDateTime);

        	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        	System.out.println("Format (dd/MM/yyyy): " + currentDate.format(formatter1));

        	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        	System.out.println("Format (Full): " + currentDate.format(formatter2));

        	DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");
        	System.out.println("Format with Time: " + currentDateTime.format(formatter3));

        	DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        	System.out.println("Format (yyyy.MM.dd): " + currentDate.format(formatter4));
    	}
}