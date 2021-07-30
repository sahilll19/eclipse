package utility;

import java.time.Duration;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalTime login = LocalTime.of(9, 05, 20);
			System.out.println("Login time: "+login);
			LocalTime logout = LocalTime.of(18, 10, 50);
			System.out.println("Logout time: "+logout);
			Duration d= Duration.between(login, logout);
			String duratn = String.format("%d:%d:%d", d.toHours(),d.toMinutesPart(),d.toSecondsPart());
			System.out.println("Duration: "+duratn);
	}

}
