package basic;

public class Even_Prime {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new EvenThread(printer).start();
        new PrimeThread(printer).start();
    }
}

class Printer {

    private int even = 2;
    private int prime = 2;
    private int count = 0;
    private boolean evenTurn = true;

    public synchronized void printEven() throws InterruptedException {
        while (!evenTurn) {
            wait();
        }

        System.out.println("---- EVEN NUMBERS ----");
        count = 0;

        while (count < 10) {
            System.out.println("Even: " + even);
            even += 2;
            count++;
        }

        evenTurn = false;
        notifyAll();
    }

    public synchronized void printPrime() throws InterruptedException {
        while (evenTurn) {
            wait();
        }

        System.out.println("---- PRIME NUMBERS ----");
        count = 0;

        while (count < 10) {
            if (isPrime(prime)) {
                System.out.println("Prime: " + prime);
                count++;
            }
            prime++;
        }

        // ⏳ WAIT 1 MINUTE AFTER PRIME
        System.out.println("⏳ Waiting for 1 minute...\n");
        Thread.sleep(60_000);

        evenTurn = true;
        notifyAll();
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

class EvenThread extends Thread {
    Printer printer;

    EvenThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        try {
            while (true) {
                printer.printEven();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrimeThread extends Thread {
    Printer printer;

    PrimeThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        try {
            while (true) {
                printer.printPrime();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
