public class P7
{
	public static void main(String args[]) 
	{
		int testScore = 85;

		if (testScore >= 50) 
		{
			System.out.println("Status: Passed");
		}

		if (testScore >= 90) 
		{
			System.out.println("Result: Excellent");
		} else {
			System.out.println("Result: Keep improving");
		}

		if (testScore >= 90) 
		{
			System.out.println("Grade: A");
		} else if (testScore >= 80) {
			System.out.println("Grade: B");
		} else if (testScore >= 70) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F");
		}
	}
}
