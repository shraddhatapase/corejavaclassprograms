package test;

public class Demof {

    public static void main(String[] args) {        
        Demo obj = new Demo();             // Create inner class instance
        String result = obj.display();           
        System.out.println(result);              // Output: 100
    }
}
    class Demo {
        public String display() {
            return "100";
        }
    }

