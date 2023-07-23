package Java_Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*public class Checker implements Comparator<Player> { // this Comparable(interface) is inbuilt in system

        public int compare(Player a, Player b) {
            // If 2 Players have the same score
            if(a.score == b.score){
                // Order alphabetically by name
                if(a.name.compareTo(b.name) < 0){
                    return -1;
                }
                else if(a.name.compareTo(b.name) > 0){
                    return 1;
                }
                return 0;
            }

            // Otherwise, order higher score first
            else if(a.score > b.score){
                return -1;
            }
            else if(a.score < b.score){
                return 1;
            }

            return 0;
        }
    }*/

    //Alternative Approach:

     class Checker implements Comparator<Player> {  // Comparing Checker to Player under the inbuilt Comparator Interface
         @Override
         public int compare(Player a, Player b) { // comparing the attributes in Player
             // if  2 or more players have the same score, sort those players alphabetically by name
             // if  2 players have the same score
             if(a.score == b.score){
                 return a.name.compareTo(b.name); // name ascending order 1,2,3,4 [sort those players alphabetically by name]
             } else{ return ((Integer)b.score).compareTo(a.score);} // b.score>a.score; score descending order 4,3,2,1

         }
     }

     /**class Checker implements Comparator<Player> {
         public int compare(Player a, Player b) {
             // If 2 Players have the same score
             if (a.score == b.score) {

                 return a.name.compareTo(b.name);
             }

             // Otherwise, order higher score first
             else if (a.score > b.score) {
                 return -1;
             } else if (a.score < b.score) {
                 return 1;
             }

             return 0;
         }

     }  **/





    class Player {
        // Attributes of Player
        String name;
        int score;

        // Constructor
        Player(String name, int score){
            this.name = name;
            this.score = score;
        }


    }
    class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt(); // n = 5

            // Instantiate
            Player[] player = new Player[n]; // Arrays of class Player(String name  and int score) //  Player[] player = new Player[5]
            Checker checker = new Checker(); //

            for(int i = 0; i < n; i++){ // 0<5; i = 0,1,2,3,4  5 ;
                player[i] = new Player(scan.next(), scan.nextInt()); // player will be printed five times
                //                          String name, int score        // occurs 5 times
               // System.out.println(player[i]);
            }
           // scan.close();

            Arrays.sort(player, checker);
            for(int i = 0; i < player.length; i++){ // 0<5; i = 0,1,2,3,4
                System.out.printf("%s %s\n", player[i].name, player[i].score); // player will be printed five times
                //System.out.println(player[i].name + " , " + player[i].score);
            }
        }
    }

    /*
    5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
     */
