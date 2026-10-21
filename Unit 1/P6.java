import java.util.Scanner;

public class P6
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
        
		System.out.println("\nPrinting your name 10 times:");
        
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i + ". " + name);
		}
        
		scanner.close();
	}
}
