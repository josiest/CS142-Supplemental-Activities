import java.util.Scanner;
import java.io.FileNotFoundException;

public class Scan {
    public static void main(String[] args) {
    }

    /** Create a new Scanner that reads the file specified by pathName.
     *
     * Parameters:
     *  pathName - the path to the file to scan.
     *
     * Throws:
     *  FileNotFoundException if the file at pathName doesn't exist.
     */
    public Scanner scannerFromPath(String pathName)
            throws FileNotFoundException {

        return new Scanner();
    }

    /** Read from a scanner until the first occurence of the specified token.
     *
     * Parameters:
     *  sc - the scanner to read from
     *  token - the token that signals when to stop reading
     *
     * Postconditions:
     *  readUntilToken returns a string of what the scanner contains, separated
     *  by spaces, up until and including the first occurence of the given
     *  token. The scanner will advance past that token as a side effect.
     *
     * Example:
     *  Scanner sc = new Scanner("The bird flew away.");
     *  String part = readUntilToken(sc, "away.");
     *  System.out.println(part);
     *  System.out.println(sc.next());
     *
     *  >>> The bird flew
     *  >>> away.
     */
    public static String readUntilToken(Scanner sc, String token) {
        return "";
    }

    /** Prompt the console for a specific word.
     *
     * Parameters:
     *  sc - the scanner linked to the console
     *  prompt - the prompt to display when the right word isn't entered
     *  word - the word to ask for.
     *
     * Preconditions:
     *  sc should be linked to System.in.
     *
     * Postconditions:
     *  promptForPhrase will attempt to read a specific word from the console.
     *  If the user doesn't enter the right word, promptForPhrase will display
     *  the specified prompt on a separate line and wait again until the user
     *  enters input again. This process will be repeated until the user enters
     *  the correct word.
     *
     * Example:
     *  Scanner sc = new Scanner(System.in);
     *  System.out.print("What's the secret password? ");
     *  promptForPhrase(sc, "Nice try.", "Pretty please");
     *  System.out.println("You may pass");
     *
     * >>> What's the secret password? Mellon
     * >>> Nice try.
     * >>> ctrl-c
     * >>> Nice try.
     * >>> Pretty please
     * >>> You may pass
     */
    public static void promptForPhrase(Scanner sc, String prompt, String word) {
        return "";
    }
}
