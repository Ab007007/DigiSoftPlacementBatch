package java18.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class DateAndTime
{
	public static void main(String[] args)
	{
		//https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html#of-java.lang.String-
		
		Date d = new Date();
		System.out.println(d.toString());
		Set<String> zoneids = ZoneId.getAvailableZoneIds();
		zoneids.forEach(System.out :: println);
		LocalDate utcDate = LocalDate.now(ZoneId.of("CST6CDT"));
		LocalDate istDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(utcDate);
		System.out.println(istDate);
	
	}
}
