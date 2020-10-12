import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String phrase, reverse = "";

        System.out.println("Palindrome Checker - Makenna Kidd\n");

        do { // do - while loop to loop phrase until break statement
            System.out.print("Enter a phrase, Done to stop: ");
            phrase = in.nextLine(); // user input
            phrase = phrase.toUpperCase(); // converting phrase to upper case to not be case sensitive
            phrase = phrase.replaceAll("\\W", "");
            new StringBuffer(phrase); // trying to clean up phrase to factor out any Non-Alphanumeric Characters
            int length = phrase.length();


            if(phrase.toLowerCase().equals("done")){return;} // Once user enters this, program will stop

            for (int i = length - 1; i >= 0; i--)
            {
                reverse = reverse + phrase.charAt(i);
            }
            // this below line replaces spaces to no spaces, builds string, and reverses string to see if it reversed equals forward word.
            if (phrase.replaceAll("\\s", "").equals(new StringBuilder(phrase.replaceAll("\\s", "")).reverse().toString())) {
                System.out.println(" That is a palindrome."); // if it does equal, it is a palindrome
            } else {
                System.out.println(" That is not a palindrome."); // if it doesnt equal, it isnt a palindrome.
            }
        } while(!phrase.equals("done")); // end of program when user enters done
    }
}