//this keyword use
//Using "this" keyword to refer to current class instance variables.
//Using this() to invoke the current class constructor
//Using 'this' keyword to return the current class instance 
//Using 'this' keyword as the method parameter
//Using 'this' keyword to invoke the current class method 
//Using 'this' keyword as an argument in the constructor call
//Output :Parameterized constructor executed: name=Alice, value=10
//Helper: demoObj.name = Alice, demoObj.value = 10
//Parameterized constructor executed: name=DefaultName, value=0
//No-arg constructor executed
//Inside helperMethod. obj.name = DefaultName, obj.value = 100
//Parameterized constructor executed: name=Bob, value=20
//Inside helperMethod. obj.name = Bob, obj.value = 20
package ConstructorInjection;
public class ThisKeywordDemo {
    private String name;
    private int value;
    // Constructor #1: no-arg
    public ThisKeywordDemo() {
        this("DefaultName", 0);               // (2) Using this() to call another constructor
        System.out.println("No-arg constructor executed");
    }
    // Constructor #2: parameterized
    public ThisKeywordDemo(String name, int value) {
        this.name = name;                      // (1) Using this to refer to instance variables
        this.value = value;
        System.out.println("Parameterized constructor executed: name=" + this.name + ", value=" + this.value);
    }

    // Method chaining: returns the current instance
    public ThisKeywordDemo setValue(int value) {
        this.value = value;                    // (1) Using this to refer to instance variable
        return this;                           // (3) Using this to return the current class instance
    }

    // Use this as method parameter (passing current object)
    public void showDetails() {
        helperMethod(this);                    // (4) Using this as method parameter
    }

    private void helperMethod(ThisKeywordDemo obj) {
        System.out.println("Inside helperMethod. obj.name = " + obj.getName() + ", obj.value = " + obj.getValue());
    }

    // Using this to invoke another method of the current class
    public void display() {
        this.showDetails();                    // (5) Using this to invoke the current class method
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // (6) Using this as an argument in the constructor call of another class
        Helper helperObj = new Helper(new ThisKeywordDemo("Alice", 10));
        helperObj.help();

        ThisKeywordDemo demo = new ThisKeywordDemo();
        demo.setValue(100)                      // method chaining
            .display();

        ThisKeywordDemo demo2 = new ThisKeywordDemo("Bob", 20);
        demo2.display();
    }
}

class Helper {
    private ThisKeywordDemo demoObj;

    public Helper(ThisKeywordDemo demoObj) {
        this.demoObj = demoObj;                   // Using this to refer to instance variable
    }

    public void help() {
        System.out.println("Helper: demoObj.name = " + demoObj.getName()
            + ", demoObj.value = " + demoObj.getValue());
    }
}
