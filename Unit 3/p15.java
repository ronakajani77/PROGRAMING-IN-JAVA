import java.util.Calendar;

public class CalendarInfoExample {
    	public static void main(String args[]) {
        	Calendar calendar = Calendar.getInstance();

        	System.out.println("Current Year: " + calendar.get(Calendar.YEAR));
        
        	System.out.println("Current Month (0-based): " + calendar.get(Calendar.MONTH));
        
        	System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
        	System.out.println("Hour (12-hour format): " + calendar.get(Calendar.HOUR));
        	System.out.println("Hour (24-hour format): " + calendar.get(Calendar.HOUR_OF_DAY));
        	System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        	System.out.println("Second: " + calendar.get(Calendar.SECOND));
        
        	System.out.println("Day of Week (1 = Sunday): " + calendar.get(Calendar.DAY_OF_WEEK));
        	System.out.println("Day of Year: " + calendar.get(Calendar.DAY_OF_YEAR));
        	System.out.println("Week of Year: " + calendar.get(Calendar.WEEK_OF_YEAR));
        	System.out.println("Time Zone: " + calendar.getTimeZone().getDisplayName());
    	}
}