package Hashcode;

import java.util.Objects;

public class Hashcode {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2); // false (different objects)
		System.out.println(s1.equals(s2)); // true (same content)
		Calculate obj = new Calculate(12, "shraddha");
		 System.out.println(obj.hashCode());
		Calculate obj2 = new Calculate(12, "shraddha");
		System.out.println(obj2.hashCode());
		System.out.println(obj2.equals(obj)); // should print true now
		System.out.println(obj2 == obj); // should print true now
	}
}

class Calculate {
	int age;
	String name;

	Calculate(int age, String name) {
		this.age = age;
		this.name = name;
	}

	 //Override equals() properly
//	 @Override
//    public boolean equals(Object classobj) {
//        if (this == classobj) // same object
//            return true;
//        if (classobj == null || getClass() != classobj.getClass())
//            return false;
//
//        Calculate objcal = (Calculate) classobj;
//        return this.age == objcal.age && this.name.equals(objcal.name);
//    }

	 //Also override hashCode() when overriding equals()
	 @Override
    public int hashCode() {       
    	return Objects.hash(age,name);
    }
}
