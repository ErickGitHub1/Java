import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Year;

public class Calendar
{
	    private Date date = new Date();
		// Constructor
		public Calendar()
		{
				System.out.println("Date: "  + date);
		}
		
		public void getDay()
		{
			SimpleDateFormat format = new SimpleDateFormat("E");
			System.out.println("Day is: "  + format.format(date));
		}
		
		public void getYear()
		{				
			int year;			
			GregorianCalendar gcalendar = new GregorianCalendar();
			year = gcalendar.get(GregorianCalendar.YEAR);
			System.out.println(("Year:" + year));
		}
}
