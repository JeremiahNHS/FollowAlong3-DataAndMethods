package part12;
// allows me to use ArrayList from the java.util package
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        starts at about 2:23:57 — stop at about 2:27:20, when he says "that is everything you need to know to get started with the for-each loop"
// Guide: GUIDE.md in this folder, steps 11–13
//
// Part 12 — the for-each loop
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForEachLoop.
//    Leave the "package part12;" line and the "public class ForEachLoop" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class ForEachLoop {
    // the main method alerts java that this is the start of the program and makes it executable
    public static void main(String[] args){
        // initializes an array animals of type String which contains 4 items
        String[] animals = {"cat", "dog", "rat", "bird"};
        // loops through each animal in animals and stores the current animal in i
        for ( String i : animals){
            // prints the value of i
            System.out.println(i);
        }
        // creates an empty ArrayList called animalList that will store Strings
        ArrayList<String> animalList = new ArrayList<String>();
        // adds "cat" to the end of animalList
        animalList.add("cat");
        // adds "dog" to the end of animalList
        animalList.add("dog");
        // adds "rat" to the end of animalList
        animalList.add("rat");
        // adds "bird" to the end of animalList
        animalList.add("bird");
        // loops through each animal in animalList and stores the current animal in i
        for (String i : animalList){
            // prints out the value of i
            System.out.println(i);
        }

    }

}
