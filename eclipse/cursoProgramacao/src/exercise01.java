import java.util.Locale;

public class exercise01 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $"
				+ " %.2f%n%nRecord: %d years old, code %d and gender: %s%n%n", product1,
				price1, product2, price2, age, code, gender);
		System.out.printf("Measure with eigth decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}

