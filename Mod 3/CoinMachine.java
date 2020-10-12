import java.util.Scanner;
class CoinMachine
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		float amountOwed = 0, amountReceived = 0;

		System.out.println("Coin Machine - Makenna Kidd\n");

		System.out.print("Enter the amount owed: ");
		amountOwed = keyboard.nextFloat();

		System.out.print("Enter the amount received: ");
		amountReceived = keyboard.nextFloat();

		double changeGiven = amountReceived - amountOwed;
		double notEnoughChange = amountOwed - amountReceived;

		if (amountReceived < amountOwed){
			System.out.printf( "*** You did not provide enough money. You are short $%.2f *** \n", notEnoughChange);
		} else {
			System.out.printf("Your change today is $%.2f \n", changeGiven);

			double numberOfCoins = (int)(Math.ceil(changeGiven * 100));

			int numberOfDollars = Math.round((int)(numberOfCoins / 100));
			numberOfCoins = numberOfCoins % 100;

			int numberOfQuarters = Math.round((int)(numberOfCoins / 25));
			numberOfCoins = numberOfCoins % 25;

			int numberOfDimes = Math.round((int)(numberOfCoins / 10));
			numberOfCoins  = numberOfCoins % 10;

			int numberOfNickels = Math.round((int)(numberOfCoins / 5));
			numberOfCoins  = numberOfCoins % 5;

			int numberOfPennies = Math.round((int)(numberOfCoins / 1));

			System.out.println("Dollars : " + numberOfDollars);
			System.out.println("Quarters : " + numberOfQuarters);
			System.out.println("Dimes : " + numberOfDimes);
			System.out.println("Nickels : " + numberOfNickels);
			System.out.println("Cents : " + numberOfPennies);
		}

	}
}



