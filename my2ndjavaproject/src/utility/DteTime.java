package utility;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DteTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LocalDate presentdate = LocalDate.now();
		System.out.println(presentdate);
		LocalDate presentdte =LocalDate.of(1999, 011, 20);
		System.out.println(presentdte);
		
		LocalTime presenttime = LocalTime.now();
		System.out.println(presenttime);
		LocalTime presenttme =LocalTime.of(12, 30, 50);
		System.out.println(presenttme);
		
		LocalDateTime presentdatetime = LocalDateTime.now();
		System.out.println(presentdatetime);
		LocalDateTime presentdtetme =LocalDateTime.of(2012, 10, 20, 11, 20);
		System.out.println(presentdtetme);
		
		
		
	}

}
