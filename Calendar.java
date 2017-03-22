import java.util.Date;
import java.text.SimpleDateFormat;

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
}
