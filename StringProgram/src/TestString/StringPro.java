package TestString;

public class StringPro {
	public static void main(String[] args) {
		String number = """
				+919860382314 +1408754321567 +447568937643 +337829423023
				+491768243516 +611234567890 +819034567890 +553234567890
				+341234567890 +861234567890
				""";
		String[] numbers = number.trim().split("\\s+");

		for (String num : numbers) {

			if (num.startsWith("+91")) {
				System.out.println(num + " → India");
			} else if (num.startsWith("+1")) {
				System.out.println(num + " → USA");
			} else if (num.startsWith("+44")) {
				System.out.println(num + " → UK");
			} else if (num.startsWith("+33")) {
				System.out.println(num + " → France");
			} else if (num.startsWith("+49")) {
				System.out.println(num + " → Germany");
			} else if (num.startsWith("+61")) {
				System.out.println(num + " → Australia");
			} else if (num.startsWith("+81")) {
				System.out.println(num + " → Japan");
			} else if (num.startsWith("+55")) {
				System.out.println(num + " → Brazil");
			} else if (num.startsWith("+34")) {
				System.out.println(num + " → Spain");
			} else if (num.startsWith("+86")) {
				System.out.println(num + " → China");
			} else {
				System.out.println(num + " → Unknown Country");
			}
		}

	}
}
