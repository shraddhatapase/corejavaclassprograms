//When overriding a method, the child class cannot reduce the visibility of the method declared in the parent class.
//But it can increase or keep the same visibility.
//
//
//Output:--- Testing Method Access in Child ---
//Child: publicMethod() (same visibility)
//Child: protectedMethod() (visibility increased to public)
//Child: defaultMethod() (visibility increased to protected)
//
//--- Upcasting to Parent Reference ---
//Child: publicMethod() (same visibility)
//Child: protectedMethod() (visibility increased to public)
//Child: defaultMethod() (visibility increased to protected)

package Accessprovider;
public class OverridingAceessiblity {

    public static void main(String[] args) {
        Children obj = new Children();

        System.out.println("--- Testing Method Access in Child ---");
        obj.publicMethod();      // ✅ Works
        obj.protectedMethod();   // ✅ Works
        obj.defaultMethod();     // ✅ Works (same package)
        // obj.privateMethod();  // ❌ Not accessible (private to Child)

        System.out.println("\n--- Upcasting to Parent Reference ---");
        Parent p = new Children();  // Runtime polymorphism
        p.publicMethod();        // ✅ Calls Child version
        p.protectedMethod();     // ✅ Calls Child version
        p.defaultMethod();       // ✅ Calls Child version (same package)
        // p.privateMethod();    // ❌ Not inherited, not accessible
    }
}
	class Parent {

	    // 1️⃣ Private method — not inherited
	    private void privateMethod() {
	        System.out.println("Parent: privateMethod()");
	    }

	    // 2️⃣ Default method — visible in same package
	    void defaultMethod() {
	        System.out.println("Parent: defaultMethod()");
	    }

	    // 3️⃣ Protected method — visible in same package and subclasses
	    protected void protectedMethod() {
	        System.out.println("Parent: protectedMethod()");
	    }

	    // 4️⃣ Public method — visible everywhere
	    public void publicMethod() {
	        System.out.println("Parent: publicMethod()");
	    }
	}

	class Children extends Parent {

	    // 1️⃣ Private method in parent — not overriding (it’s a new method)
	    private void privateMethod() {
	        System.out.println("Child: privateMethod() (new method, not override)");
	    }

	    // 2️⃣ Default → Protected ✅ Allowed (visibility increased)
	    @Override
	    protected void defaultMethod() {
	        System.out.println("Child: defaultMethod() (visibility increased to protected)");
	    }

	    // 3️⃣ Protected → Public ✅ Allowed (visibility increased)
	    @Override
	    public void protectedMethod() {
	        System.out.println("Child: protectedMethod() (visibility increased to public)");
	    }

	    // 4️⃣ Public → Protected ❌ NOT Allowed — uncomment below line to see compiler error
	    /*
	    @Override
	    protected void publicMethod() {  // ❌ Error: cannot reduce visibility
	        System.out.println("Child: publicMethod() (visibility reduced to protected)");
	    }
	    */

	    // ✅ Correct overriding version (same visibility)
	    @Override
	    public void publicMethod() {
	        System.out.println("Child: publicMethod() (same visibility)");
	    }
	}