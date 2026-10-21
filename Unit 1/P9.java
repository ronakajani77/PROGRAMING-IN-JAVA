import java.util.Scanner;

public class P9
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter the student's score (0-100): ");
		double score = scanner.nextDouble();

		if (score < 0 || score > 100) 
		{
			System.out.println("Invalid score! Please enter a value between 0 and 100.");
		} else if (score >= 90) {
			System.out.println("Result: Pass | Grade: A");
		} else if (score >= 80) {
			System.out.println("Result: Pass | Grade: B");
		} else if (score >= 70) {
			System.out.println("Result: Pass | Grade: C");
		} else if (score >= 60) {
			System.out.println("Result: Pass | Grade: D");
		} else {
			System.out.println("Result: Fail | Grade: F");
		}
        
		scanner.close();
	}
}
