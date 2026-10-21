public class P4
{
	public static void main(String args[]) 
	{
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);

		double sum        = num1 + num2;
		double difference = num1 - num2;
		double product    = num1 * num2;

		System.out.println("--- Arithmetic Operations ---");
		System.out.println("Addition       (" + num1 + " + " + num2 + ") = " + sum);
		System.out.println("Subtraction    (" + num1 + " - " + num2 + ") = " + difference);
		System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + product);

		if (num2 != 0) 
		{
			double quotient  = num1 / num2;
			double remainder = num1 % num2;
			System.out.println("Division       (" + num1 + " / " + num2 + ") = " + quotient);
			System.out.println("Modulus        (" + num1 + " % " + num2 + ") = " + remainder);
		} else {
			System.out.println("Division       = Cannot divide by zero.");
			System.out.println("Modulus        = Cannot divide by zero.");
		}
	}
}
