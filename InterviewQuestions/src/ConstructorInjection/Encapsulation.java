package ConstructorInjection;

public class Encapsulation {
	public static void main(String[] args) {
		Animal animal = new Animal();
		/**
		 * Because animalId is Private. and it is accessible only within the same class.
		 */
		animal.setanimalId(101);
		// animal.animalId=100;
		System.out.println("ID is:{+" + animal.getId());
	}
}
class Animal {
	/**
	 * Meta Information=> extra Information.
	 */
	static int count = 0;
	private int animalId;
	String animalName;
	String foodHabit;
	public Animal() {
		System.out.println(animalId);
		count++;
		System.out.println("Object created....");
		System.out.println("Object number :" + count);
	}
	public void setanimalId(int id) {
		if (id > 100) {
			this.animalId = id;
		}
		System.out.println("Invalid ID");
	}	
	public int getId() {
		return this.animalId;
	}	
}