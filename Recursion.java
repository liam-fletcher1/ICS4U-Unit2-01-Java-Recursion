/*
 * The recursion program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-29
 */

public final class Recursion {
    private Recursion() {

    }
    /**
     * This function will reverse a string 
     * @return
     * returns recursion.
     * @param someString
     */
    static String stringReversal(final String someString) {
        if (someString.length() == 0) {
            return someString;
        } else {
            // Calling and returning the reverseString 
            return stringReversal(someString.substring(1)) + someString.charAt(0);
        }
    }

    /**
     * This function prints a string then prints the same string in reverse.
     * @param args
     */
    public static void main(final String[] args) {
        String recursionString = "recursion";

        System.out.println("The original string is '" + recursionString + "'");

        // Calling the function that will reverse the string
        String newString = stringReversal(recursionString);

        // Output
        System.out.println("The newly reversed string is '" + newString + "'");
    }
}
