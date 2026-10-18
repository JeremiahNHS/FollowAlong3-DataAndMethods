package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class ArrayBasics {
    // the main method alerts java that this is the start of the program and makes it executable
    public static void main(String[] args){
        // initializes an array of type string which has 3 slots for car names; slots stay empty until filled
        String[] cars = new String[3];
        // sets index 0 of the array cars equals to "Camaro"
        cars[0] = "Camaro";
        // sets index 1 of the array cars equals to "Corvette"
        cars[1] = "Corvette";
        // sets index 2 of the array cars equals to "Tesla"
        cars[2] = "Tesla";
        // prints out index 0 of cars which is "Camaro"
        System.out.println(cars[0]);
        // prints out index 1 of cars which is "Corvette"
        System.out.println(cars[1]);
        // prints out index 2 of cars which is "Tesla"
        System.out.println(cars[2]);
        // goes through each spot and stops before it reaches the length of cars
        for ( int i = 0; i < cars.length; i++){
            // prints out the value of i after each iteration
            System.out.println(cars[i]);
        }
    }

}
