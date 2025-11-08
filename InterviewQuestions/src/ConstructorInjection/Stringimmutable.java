//Output : 
//	s1 = Hello
//	s2 = Hello
//	s3 = Hello World
//	s1 == s2 : true
//	s1 == s3 : false
//Once a String object has been created, its internal character sequence (its content) cannot be altered. 
//GeeksforGeeks
//+2
//GeeksforGeeks
//+2
//
//Any operation that seems to modify the string (like concat(), replace(), etc.) actually produces a new String object — the original remains unchanged. 
//GeeksforGeeks
//+1

//You are free to change which object a variable references (i.e., reassign), but you cannot mutate the underlying object’s content
package ConstructorInjection;

public class Stringimmutable {
	    public static void main(String[] args) {
	        String s1 = "Hello";
	        String s2 = s1;              // s2 references same object as s1

	        // Try to “modify” s1
	        String s3 = s1.concat(" World");  // create a new String

	        System.out.println("s1 = " + s1);       // Prints: Hello
	        System.out.println("s2 = " + s2);       // Prints: Hello
	        System.out.println("s3 = " + s3);       // Prints: Hello World

	        // Check reference equality
	        System.out.println("s1 == s2 : " + (s1 == s2));  // true (same reference)
	        System.out.println("s1 == s3 : " + (s1 == s3));  // false (different object)
	    }
	}

