package part12;
// allows me to use ArrayList from the java.util package
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class ArrayLists {
    // the main method alerts java that this is the start if the program and makes it executable
    public static void main(String[] args){
        // creates an empty ArrayList called food that will store Strings
        ArrayList<String> food = new ArrayList<String>();
        // adds pizza to the end of the ArrayList food
        food.add("pizza");
        // adds hamburger to the end of the ArrayList food
        food.add("hamburger");
        // adds hotdog to the end of the ArrayList food
        food.add("hotdog");
        // i starts at 0 and increments by 1 in until it reaches the size of the ArrayList food
        for (int i = 0; i < food.size(); i++) {
            // food.get grabs the value at that index and spits it out
            System.out.println(food.get(i));
        }
        // food.set changes the 0th index of food to sushi
        food.set(0,"sushi");
        // prints out the updated ArrayList food
        System.out.println(food);
        // food.remove(2) removes the item at the second index of food
        food.remove(2);
        // prints out the updated ArrayList food
        System.out.println(food);
        // erases everything in the list
        food.clear();
        // prints out the empty list
        System.out.println(food);
    }
}
