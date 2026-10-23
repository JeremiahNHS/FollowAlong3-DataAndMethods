package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class Methods {
    // the main method alerts java this is the start of the program and makes it executable
    public static void main(String[] args){
        // initializes the variable name of type String with the value of "Bro"
        String name = "Bro";
        // initializes the variable age of type int with the value 21
        int age = 21;
        // calls the static method hello with name and age as arguments
        hello(name, age);
        // initializes the variable x of type int with the value of 3
        int x = 3;
        // initializes the variable y of type int with the value of 4
        int y = 4;
        // calls add with x and y and stores the returned sum in z
        int z = add(x,y);
        // prints out the value of z
        System.out.println(z);
        // calls the method add with its two parameters and prints out the returned value
        System.out.println(add(x, y));

    }
    // defines a static method called hello which takes a name and age and returns nothing
    static void hello(String name, int age) {
        // prints out Hello plus the value of name
        System.out.println("Hello " + name);
        // prints out You are plus the value of age
        System.out.println("You are " + age);
    }
    // defines a static method called add that takes two ints and returns their sum
    public static int add(int x, int y) {
        // returns the sum of x + y and sends it to where the method is called in main
        return x + y;
    }

}
