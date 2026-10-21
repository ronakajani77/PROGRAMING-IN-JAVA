import java.util.Scanner;

public class P3
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your full name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.print("Enter your height (in meters, e.g., 1.75): ");
		double height = scanner.nextDouble();

		System.out.println();

		System.out.println("--- Personal Information Summary ---");
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age + " years old");
		System.out.println("Height : " + height + " meters");

		scanner.close();
	}
}
