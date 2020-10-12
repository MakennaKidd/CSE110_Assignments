import java.util.Scanner;
class Savings
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n = 0; // n = months
		double i = 0, pv = 0; // i = interest rate, pv = principle value

		System.out.print("Simple Interest - Makenna Kidd\n");
		System.out.print("What is the initial savings amount?");
		pv = keyboard.nextDouble();

		System.out.print("What is the number of months to save?");
		n = keyboard.nextInt();

		System.out.print("What is the annual interest rate?");
		i = keyboard.nextDouble();

		double result = pv * Math.pow(1 + (i / 100)/12, n); // result = interest math equation fv=pv*((1+i/100)/12)^n

		System.out.printf("$%.2f, saved for %d months at %.2f%% will be valued at $%.2f \n", pv, n, i, result);
	}
}