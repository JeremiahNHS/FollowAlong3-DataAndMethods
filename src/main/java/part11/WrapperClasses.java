package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class WrapperClasses {
    // the main method alerts java that this is the start of the program and makes it executable
    public static void main(String[] args){
        // initializes the variable a which points to an object in the heap that holds the value of true
        Boolean a = true;
        // initializes the variable b which points to an object in the heap that holds the value of '@'
        Character b = '@';
        // initializes the variable c which points to an object in the heap that holds the value of 123
        Integer c = 123;
        // initializes the variable d which points to an object in the heap that holds the value of 3.14
        Double d = 3.14;
        // initializes the variable e which points to an object in the heap that holds the value of "Bro"
        String e = "Bro";
        // checks if the value of a is equal to true
        if (a == true){
            // prints out the text followed by a new line
            System.out.println("This is true");
        }
        // checks if the value of b is equal to '@'
        if (b == '@'){
            // prints out the text followed by a new line
            System.out.println("This is true");
        }


    }

}
