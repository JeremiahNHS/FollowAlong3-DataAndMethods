package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class StringMethods {
    // the main method is where the program starts running
    public static void main(String[] args){
        // initializes the variable name of type String with the value "Bro"
        String name = "Bro";
        // initializes the variable equalsResult of type boolean; name.equals("Bro") checks if name is equal to "Bro"; and stores the result
        boolean equalsResult = name.equals("Bro");
        // prints out the boolean value of equalsResult
        System.out.println(equalsResult);
        // initializes the variable lowerResult of type boolean; name.equals("bro") checks if name is equal to "bro"; and stores the result
        boolean lowerResult = name.equals("bro");
        // prints out the boolean value of lowerResult
        System.out.println(lowerResult);
        // initializes the variable ignoreResult of type boolean; name.equalsIgnoreCase("bro") checks, ignoring the case, if name is equal to "bro"; and stores the result
        boolean ignoreResult = name.equalsIgnoreCase("bro");
        // prints out the boolean value of ignoreResult
        System.out.println(ignoreResult);
        // initializes the variable lengthResult of type int; name.length() gives the length of name
        int lengthResult = name.length();
        // prints out the value of lengthResult
        System.out.println(lengthResult);
        // initializes the variable charResult of type char; name.charAt(0) finds the char at index 0
        char charResult = name.charAt(0);
        // returns the value of charResult
        System.out.println(charResult);
        // initializes the variable indexResult of type int; name.indexOf("o") finds the index of the first usage of 'o'
        int indexResult = name.indexOf("o");
        // prints out the value of indexResult
        System.out.println(indexResult);
        // initializes the variable emptyResult of type boolean which; name.isEmpty() checks if name is and empty string and gives a boolean
        boolean emptyResult = name.isEmpty();
        // returns the boolean value of emptyResult
        System.out.println(emptyResult);
        // initializes the variable upperResult of type String; name.toUpperCase() makes all the letters in name upper case and saves it as a new string in upperResult
        String upperResult = name.toUpperCase();
        // prints out the value of upperResult
        System.out.println(upperResult);
        // initializes the variable lowerCaseResult of type String which; name.toLowerCase() makes all the letters in name lower case and saves it as a new string in lowerCaseResult
        String lowerCaseResult = name.toLowerCase();
        // prints out the value of lowerCaseResult
        System.out.println(lowerCaseResult);
        // initializes the variable spaced of type String which holds the word "Bro" in between spaces
        String spaced = "   Bro   ";
        // initializes the variable trimResult of type String; space.trim removes any white spaces
        String trimResult = spaced.trim();
        // prints out the value of spaced wrapped in straight brackets
        System.out.println("[" + spaced + "]");
        // prints out the value of trimResult wrapped in straight brackets
        System.out.println("[" + trimResult + "]");
        // initializes the variable replaceResult of type String; name.replace('o','a') replaces all occurrences of 'o' with 'a'
        String replaceResult = name.replace('o','a');
        // prints out the value of replaceResult with the replaced letters
        System.out.println(replaceResult);

    }

}
