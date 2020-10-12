import java.util.Random;
import java.util.Scanner;

public class Hangman
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        String words[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String randomWord = words[new Random().nextInt(words.length)].toUpperCase(); //randomizes which word to pick/ converts to uppercase/length of word for underscores
        char[] randomWordLetters = randomWord.toCharArray();
        char[] matches = new char[randomWord.length()];
        boolean guessedIncorrect = true; //boolean for the while statement
        char letter;
        int attempts = 0;
        String guessedLetters = ""; // user input

        System.out.println("Hangman - Makenna Kidd\n");

        //this prints the underscores and blank list first rather than just "Enter a letter"
        printArrayAndCompare(randomWordLetters, matches, guessedLetters);

        // this initiates getting the letter and putting in the guesses for the word
        do
        {
            letter = getUserLetter();
            if (guessedLetters.contains(String.valueOf(letter))) {
                continue;
            }
            guessedLetters += letter;
            attempts += 1;
            updateMatches(randomWordLetters, matches, letter);
            boolean flag = printArrayAndCompare(randomWordLetters, matches, guessedLetters);
            if (flag) {
                System.out.println("You guessed it in " + attempts + " tries.");
                guessedIncorrect = false;
            }
        } while (guessedIncorrect);
    }

    private static boolean printArrayAndCompare(char[] wordLetter, char[] userLetter, String guessedLetters) //letters guessed to be stored
    {
    boolean flagComparison = true;

    for (int i = 0; i < userLetter.length; i++) {
        if (wordLetter[i] == userLetter[i])
            System.out.print(userLetter[i] + " ");
        else {
            System.out.print("- ");
            flagComparison = false;
        }
    }
    System.out.print("\tUsed letters: {" + guessedLetters + "}\n");
    return flagComparison;
    }

    private static void updateMatches(char[] randomWordLetters, char[] matches, char letter) // method for random word
    {
        for (int index = 0; index < matches.length; index++) {
            if (randomWordLetters[index] == letter) {
                matches[index] = letter;
            }
        }
    }

    public static char getUserLetter() //method for user input in do while statement
    {
        String input = "";
        System.out.print("Enter a letter: ");
        input = scanner.nextLine().trim().toUpperCase();
        return input.charAt(0);
    }
}