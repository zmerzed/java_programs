import java.util.*;

public class Example2_8 {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		String firstName;
		String lastName;

		int age;
		double weight;

		System.out.println("Enter firstname, lastName, age, weight sep by spaces..");

		firstName = console.next();
		lastName = console.next();

		age = console.nextInt();
		weight = console.nextDouble();

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);

		System.out.println("age" + age);
		System.out.println("weight" + weight);

	}
}
