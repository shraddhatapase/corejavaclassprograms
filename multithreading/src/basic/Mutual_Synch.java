package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mutual_Synch {

    public static void main(String[] args) {

        StudentUtil util = new StudentUtil();

        // MULTIPLE PRODUCERS
        new Getdet(util, "Producer-1").start();
        new Getdet(util, "Producer-2").start();

        // MULTIPLE CONSUMERS
        new Senddet(util, "Consumer-1").start();
        new Senddet(util, "Consumer-2").start();
    }
}

/* ===================== STUDENT ===================== */

class Student {
    int id;
    String name;
    String email;

    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

/* ===================== SHARED RESOURCE ===================== */

class StudentUtil {

    private final List<Student> buffer = new ArrayList<>();
    private final int CAPACITY = 2;

    public synchronized void addStudent(Student s) throws InterruptedException {

        while (buffer.size() == CAPACITY) {
            System.out.println(Thread.currentThread().getName()
                    + " waiting (buffer full)");
            wait();
        }

        buffer.add(s);
        System.out.println(Thread.currentThread().getName()
                + " added student: " + s.email);

        notifyAll();   // IMPORTANT for multiple threads
    }

    public synchronized void sendMail() throws InterruptedException {

        while (buffer.isEmpty()) {
            System.out.println(Thread.currentThread().getName()
                    + " waiting (buffer empty)");
            wait();
        }

        Student s = buffer.remove(0);
        System.out.println(Thread.currentThread().getName()
                + " sending mail to: " + s.email);

        notifyAll();   // IMPORTANT
    }
}

/* ===================== PRODUCER THREAD ===================== */

class Getdet extends Thread {

    StudentUtil util;
    Scanner scan = new Scanner(System.in);

    Getdet(StudentUtil util, String name) {
        super(name);
        this.util = util;
    }

    public void run() {
        try {
            while (true) {
                System.out.print(getName() + " enter name: ");
                String name = scan.next();

                System.out.print(getName() + " enter email: ");
                String email = scan.next();

                util.addStudent(new Student(0, name, email));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* ===================== CONSUMER THREAD ===================== */

class Senddet extends Thread {

    StudentUtil util;

    Senddet(StudentUtil util, String name) {
        super(name);
        this.util = util;
    }

    public void run() {
        try {
            while (true) {
                util.sendMail();
                Thread.sleep(2000); // simulate email sending delay
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
