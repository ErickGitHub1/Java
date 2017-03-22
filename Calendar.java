import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Year;

public class Calendar
{
	    private Date date = new Date();
	    private GregorianCalendar gcalendar = new GregorianCalendar();
		// Constructor
		public Calendar()
		{
				System.out.println("Date: "  + date);
				
		}
		
		// Getting day of week
		public void getDay()
		{
			SimpleDateFormat format = new SimpleDateFormat("E");
			System.out.println("Day is: "  + format.format(date));
		}
		
		// Getting actual year
		public void getYear()
		{	
			int year;			
			year = gcalendar.get(GregorianCalendar.YEAR);
			System.out.println(("Year:" + year));
		}
		
		// Checkin if actual year is leap
		public void isLeap(int year)
		{
				if(gcalendar.isLeapYear(year) == true)
				{
					System.out.println("Year " + year + " is leap");
				}else
				{
					System.out.println("Year " + year + " is not leap");
				}
		}
}
