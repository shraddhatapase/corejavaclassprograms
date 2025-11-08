package TestString;

public class StringPro {
    public static void main(String[] args) {        
        String mobilename = "+919860382314 +1408754321567 +447568937643 +337829423023 
                          "+491768243516 +611234567890 +819034567890 +553234567890 
                          + "+341234567890 +861234567890"; 
          

            if (number.startsWith("+91")) {
                System.out.println(number + " → India");
            } else if (number.startsWith("+1")) {
                System.out.println(number + " → USA");
            } else if (number.startsWith("+44")) {
                System.out.println(number + " → UK");
            } else if (number.startsWith("+33")) {
                System.out.println(number + " → France");
            } else if (number.startsWith("+49")) {
                System.out.println(number + " → Germany");
            } else if (number.startsWith("+61")) {
                System.out.println(number + " → Australia");
            } else if (number.startsWith("+81")) {
                System.out.println(number + " → Japan");
            } else if (number.startsWith("+55")) {
                System.out.println(number + " → Brazil");
            } else if (number.startsWith("+34")) {
                System.out.println(number + " → Spain");
            } else if (number.startsWith("+86")) {
                System.out.println(number + " → China");
            } else {
                System.out.println(number + " → Unknown Country");
            }
        
    }
}
