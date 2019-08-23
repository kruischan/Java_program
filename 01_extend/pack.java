

class Person {
	static {
		System.out.println("static block");
	}

	{
		System.out.println("normal block");
	}

	private Person() {
		System.out.println("Person private Construct method");
		if ("1".equals("1")) {
			System.out.println("1 equal");
		}
	}

	public Person(int age) {
		System.out.println("Person public Construct method");
	}
}


class Child {
	public Child() {
		System.out.println("Child construct method");
	}
}


public class pack {
	public static void main(String args[]) {
		// Person p1 = new Person();
		// Person p2 = new Person();		
		
		Person p = new Person(10);
		Child c1 = new Child();
	}
}













