import java.util.Scanner;
class TextSlang
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String BRB = "Be Right Back";
		String FOMO = "Fear Of Missing Out";
		String IDK = "I Don't Know";
		String IRL = "In Real Life";
		String JK = "Just Kidding";
		String LOL = "Laughing Out Loud";
		String TTFN = "Ta-Ta For Now";
		String TTYL = "Talk To You Later";
		String YOLO = "You Only Live Once";

		boolean programExitConditionMet = false; //closing condition variable

		String Slang = " "; // User Input

		System.out.println("TextSlang - Makenna Kidd\n");

		do{ // start of do-while statement
			System.out.print("Enter a text slang term, TTFN to stop: ");
			Slang = in.next();
			System.out.print(Slang.toUpperCase()); // adding slang uppercase on next line with output

			switch(Slang.toUpperCase()) { //start of switch statement and conversion to uppercase for code to read
			case "BRB" : // do this if user types brb
			System.out.println(" means Be Right Back." );
			break;

			case "FOMO" : // do this if user types fomo
			System.out.println(" means Fear of Missing Out.");
			break;

			case "IDK" : // do this if user types idk
			System.out.println(" means I Don't Know.");
			break;

			case "IRL" : // do this if user types irl
			System.out.println(" means In Real Life.");
			break;

			case "JK" : // do this if user types jk
			System.out.println(" means Just Kidding.");
			break;

			case "LOL" : // do this if user types lol
			System.out.println(" means Laughing Out Loud.");
			break;

			case "TTYL" : //Do this if user types ttyl
			System.out.println(" means Talk To You Later.");
			break;

			case "YOLO" : // do this if user types yolo
			System.out.println(" means You Only Live Once.");
			break;

			case "TTFN" : // do this if user types ttfn
			System.out.println(" means Ta-Ta For Now.");
			programExitConditionMet = true;
			break;

			default: System.out.println(" means something I don't know."); // Do this if choice is nothing from above.
			break; // end of switch statement
			}
		} while(programExitConditionMet == false); //end of do-while  statement
	}
}


