
public class EqualsTesterApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		A a1 = new A("A is Awesome!");
		A a2 = new A("A is Awesome!");
		
		System.out.println("a1 = "+a1.getName());
		System.out.println("a2 = "+a2.getName());
		if (a1.equals(a2)) {
			System.out.println("a1 equals a2");
		}
		else {
			System.out.println("a1 not equal to a2");
		}
		System.out.println("Bye");
	}

}
