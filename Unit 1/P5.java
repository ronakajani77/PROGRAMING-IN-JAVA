import java.util.Scanner;

public class P5
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- Enter Your Details Below ---");

		System.out.print("Enter your full name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.print("Enter your GPA or salary: ");
		double gpa = scanner.nextDouble();

		System.out.print("Are you a student? (true/false): ");
		boolean isStudent = scanner.nextBoolean();

		scanner.nextLine();

		System.out.print("Enter your favorite city: ");
		String city = scanner.next();

		System.out.print("Enter your grade letter (A/B/C/D/F): ");
		char grade = scanner.next().charAt(0);

		System.out.println("\n--- Summary of Your Inputs ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + " years old");
		System.out.println("GPA: " + gpa);
		System.out.println("Student Status: " + isStudent);
		System.out.println("Favorite City: " + city);
		System.out.println("Grade: " + grade);

		scanner.close();
	}
}
