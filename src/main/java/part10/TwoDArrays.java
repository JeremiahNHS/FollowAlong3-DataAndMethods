package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class TwoDArrays {
    // the main method alerts java that this is the start of the program and makes it executable
    public static void main(String[] args){
        // a 2D array of type String which holds 3 rows of cars
        String[][] cars = {
                // row 0
                {"Camaro", "Corvette", "Silverado"},
                // row 1
                {"Mustang", "Ranger", "F-150"},
                // row 2
                {"Ferrari", "Lambo", "Tesla"}
        };
        // cars.length is 3, so i starts at 0 and increases until it reaches 3
        for (int i = 0; i < cars.length; i++){
            // moves to a new line before printing the cars in the next row
            System.out.println();
            // cars[i].length is 3, so j goes from 0 to 2 and loops through each car in the current row before moving to the next row
            for (int j = 0; j < cars[i].length; j++){
                // prints the car at row i and column j, with a space after it, without starting a new line
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
