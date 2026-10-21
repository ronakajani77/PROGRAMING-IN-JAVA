public class P10
{
	public static void main(String args[]) 
	{
		int[] numbers = {10, 20, 30, 40, 50};

		System.out.println("First element (Index 0): " + numbers[0]);
		System.out.println("Third element (Index 2): " + numbers[2]);

		numbers[3] = 99;
		System.out.println("Modified element at Index 3: " + numbers[3]);

		System.out.println("Array size: " + numbers.length);

		System.out.println("\nAll array elements:");
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
        
		int sum = 0;
		for (int num : numbers) 
		{
			sum += num;
		}
		System.out.println("\nSum of all elements: " + sum);
	}
}
