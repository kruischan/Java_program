class Person {
	public int age;
	public String name;

	Person(int age) {
		System.out.println("Person construction : " + age);
	}

	protected String getName() {
		return this.name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "This name is " + name;
	}
}

class Children extends Person {
	public String apperance;

	Children() {
		super(5);
		System.out.println("Child construction!");
	}

	public void invokeProtectedWay() {
		setName("kruis");
		super.toString();
	}
}

public class Extendtion2 {
	public static void main(String[] args) {
		Children child = new Children();

		System.out.println(child.invokeProtectedWay());
	}	
}



