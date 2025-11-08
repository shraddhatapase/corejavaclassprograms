//program for scp and string is immutable
//Output:
//Hellokomal
//s1 == s2 : true
//s1 == s3 : false
//s3 == s4 : false
//s1 == s5 : true
//s5 == s6 : true
//true
//false
//true
//true
//true
//false
package ConstructorInjection;

public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        String s5 = s3.intern();
        String s6 = "Hello";
        //Expain string immutable in java
        String s8 = "Hellokomal";
        s8.concat(" World");  
        System.out.println(s8);  // prints "Hello"

        
        
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s1 == s5 : " + (s1 == s5));
        System.out.println("s5 == s6 : " + (s5 == s6));
        
        String p1 = "HELLO";
        String p2 = "HELLO";
        String p3 =  new String("HELLO");
        String p4 =  new String("HELLO");

        System.out.println(p1 == p2);
        System.out.println(p1 == p3); 
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3)); 
        System.out.println(p3.equals(p4));
        System.out.println(p3==p4);
    }
}

