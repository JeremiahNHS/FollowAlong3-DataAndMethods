package part12;
// allows me to use ArrayList from the java.util package
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class TwoDArrayLists {
    // the main method alerts java that this is the start of the program and makes it executable
    public static void main(String[] args){
        // creates an empty ArrayList called bakeryList that will store Strings
        ArrayList<String> bakeryList = new ArrayList<String>();
        // adds pasta to the end of the ArrayList bakeryList
        bakeryList.add("pasta");
        // adds "garlic bread" to the end of the ArrayList bakeryList
        bakeryList.add("garlic bread");
        // adds "donuts" to the end of the ArrayList bakeryList
        bakeryList.add("donuts");
        // creates an empty ArrayList called produceList that will store Strings
        ArrayList<String> produceList = new ArrayList<String>();
        // adds "tomatoes" to the end of the ArrayList produceList
        produceList.add("tomatoes");
        // adds "zucchini" to the end of the ArrayList produceList
        produceList.add("zucchini");
        // adds "peppers" to the end of the ArrayList produceList
        produceList.add("peppers");
        // creates an empty ArrayList called drinksList that will store Strings
        ArrayList<String> drinksList = new ArrayList<String>();
        // adds "soda" to the end of the ArrayList drinksList
        drinksList.add("soda");
        // adds "coffee" to the end of the ArrayList drinksList
        drinksList.add("coffee");
        // prints out the entire bakeryList
        System.out.println(bakeryList);
        // prints out the item at index 0 of bakeryList
        System.out.println(bakeryList.get(0));
        // prints out the entire drinksList
        System.out.println(drinksList);
        // creates a list within a list which contains lists call groceryList
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // adds bakeryList as the first list inside groceryList
        groceryList.add(bakeryList);
        // adds produceList as the second list inside groceryList
        groceryList.add(produceList);
        // adds drinksList as the second list inside groceryList
        groceryList.add(drinksList);
        // prints out the groceryList which is a list of list; it prints out all the list I added
        System.out.println(groceryList);
        // prints out the list at index 0 of groceryList
        System.out.println(groceryList.get(0));
        // prints out the item at index 0 of list index 0 in groceryList
        System.out.println(groceryList.get(0).get(0));
        // prints out the item at index 1 of list index 2 in groceryList
        System.out.println(groceryList.get(2).get(1));
    }
}
