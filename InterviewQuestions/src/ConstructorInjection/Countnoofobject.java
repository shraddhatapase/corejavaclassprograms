//Output:StudentInfo object created. Total objects: 1
//StudentInfo object created. Total objects: 2
//StudentInfo object created. Total objects: 3
//Total number of StudentInfo objects created: 3

package ConstructorInjection;
public class Countnoofobject {
	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		StudentInfo s2 = new StudentInfo();
		StudentInfo s3 = new StudentInfo();
		// Display total count using static method
		StudentInfo.showCount();
	}
}
class StudentInfo {
	// Static variable to count objects
	static int count = 0;

	// Constructor
	StudentInfo() {
		count++; // Increment every time a new object is created
		System.out.println("StudentInfo object created. Total objects: " + count);
	}

	// Static method to show total count
	static void showCount() {
		System.out.println("Total number of StudentInfo objects created: " + count);
	}
}