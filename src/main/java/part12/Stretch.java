package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        /* MY GUESS:
        [yellow, blue]
        2
        yellow
        yellow blue

         */
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        colors.remove(0);
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));
        for (String c : colors) {
            System.out.print(c + " ");
        }
        System.out.println();

        //B1
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for (int s : scores){
            sum = sum + s;
        }
        System.out.println("Total: " + sum);

        //B2
        ArrayList<String> playList = new ArrayList<String>();
        playList.add("Song A");
        playList.add("Song B");
        playList.add("Song C");
        playList.add("Song D");
        for (int i = 0; i < playList.size(); i++){
            System.out.println((i + 1) + ". " + playList.get(i));
        }
        playList.remove(1);
        System.out.println("Songs left: " + playList.size());
        System.out.println(playList);

        //B3
        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("Ana");
        row1.add("Ben");

        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("Cam");
        row2.add("Dee");
        row2.add("Eli");

        ArrayList<ArrayList<String>> seats = new ArrayList<>();
        seats.add(row1);
        seats.add(row2);

        for (ArrayList<String> row : seats){
            System.out.print("Row:");
            for (String person : row){
                System.out.print(" " + person);
            }
            System.out.println();
        }
        System.out.print("Back corner: " + seats.get(1).get(2));





    }

}
