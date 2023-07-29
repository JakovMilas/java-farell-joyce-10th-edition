import java.time.*;

public class LocalDateDemo {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
		LocalDate graduationDate = LocalDate.of(2024, 5, 29);
		System.out.println("\nToday is " + today);
		System.out.println("Graduation date is " + graduationDate);
		System.out.println("Gradutation will be on day " +
				graduationDate.getDayOfMonth() + " in month " +
				graduationDate.getMonthValue());
		System.out.println("Graduation will be on " +
				graduationDate.getDayOfWeek() + " in " +
				graduationDate.getMonth() + " " +
				graduationDate.getYear());
	
	}	

}
