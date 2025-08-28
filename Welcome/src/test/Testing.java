//prime no program in java
package test;

public class Testing {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true; 

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;               
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
