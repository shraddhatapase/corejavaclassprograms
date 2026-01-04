package copying;

public class Final_Demo {

	public static void main(String[] args) throws Exception {
		Subdivision sub = new Subdivision("Mumbai");

		Village v1 = new Village(3001, "Alibaug", sub);

		Village v2 = (Village) v1.clone();

		v2.sub.sub_name = "Mulud";

		v2.population = 1500;

		System.out.println(v2);
		System.out.println(v1);
		// java.lang.CloneNotSupportedException

		System.out.println(v2.hashCode());
		System.out.println(v1.hashCode());		
		}
	}

class Village implements Cloneable {
	int population;
	String name;
	Subdivision sub;

	public Village(int population, String name, Subdivision sub) throws Exception {
		if (population > 3000) {
			this.name = name;
			this.population = population;
			this.sub = sub;
		} else {
			throw new Exception("NO object creation peremitted.....");
		}
		System.out.println("B");
	}

//	public Village(Village village) throws Exception
//	{
//		Subdivision sub1=new Subdivision(village.sub.sub_name);
//		Village village1=new Village(village.population,village.name,sub1);
//		
//		this.name=village1.name;
//		this.population=village1.population;
//		this.sub=village1.sub;
//	}

	public Object clone() throws CloneNotSupportedException {

		Village v1 = (Village) super.clone();
		// GC=> v1=sub, v=>sub
		v1.sub = (Subdivision) this.sub.clone();
		return v1;
	}

	public String toString() {
		return this.name + " " + this.population + " " + this.sub.sub_name;
	}
}

class Subdivision implements Cloneable {
	String sub_name;

	public Subdivision(String sub_name) {
		this.sub_name = sub_name;

		System.out.println("A");
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

