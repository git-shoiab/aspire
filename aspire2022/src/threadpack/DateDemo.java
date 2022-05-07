package threadpack;

import java.time.LocalDateTime;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		//Nonoseconds precision
		LocalDateTime localDateTime1 =
				LocalDateTime.of(2019, 03, 28, 14, 33, 48, 640000);
		System.out.println(localDateTime1);
		//Using Month Enum
		LocalDateTime localDateTime2 =
				LocalDateTime.of(2019, Month.MARCH, 28, 14, 33, 48, 000000);
		System.out.println(localDateTime2);
		//Seconds level precision
		LocalDateTime localDateTime3 =
				LocalDateTime.of(2019, Month.MARCH, 28, 14, 33, 48);
		System.out.println(localDateTime3);
		//Minutes level precision
		LocalDateTime localDateTime4 =
				LocalDateTime.of(2019, Month.MARCH, 28, 14, 33);
		System.out.println(localDateTime4);
	}
}
