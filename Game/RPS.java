
package Game;

import java.util.*;
// import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String[] rps={"r","p","s"};
            // computer move
            String computerMove= rps[new Random().nextInt(rps.length)];
            // player move
            String playerMove="";
            while(true){
                System.out.println("Enter you move:-r/p/s");
                playerMove=sc.nextLine();
                
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    break;
                }
                System.out.println("The Player Move entered is not-valid");
                // System.out.println("computer played :"+computerMove);
            }
            System.out.println("computer played: "+computerMove);
            if(playerMove.equals(computerMove)){
                System.out.println("it is a tie.");
            }else if(playerMove.equals("r")){
                if(computerMove.equals("p")){
                    System.out.println("Computer Wins.");
                }else if(computerMove.equals("s")){
                    System.out.println("Player wins");

                }
            }else if(playerMove.equals("p")){
                if(computerMove.equals("r")){
                    System.out.println("Player wins.");
                }else if(computerMove.equals("s")){
                    System.out.println("computer wins.");
                }
            }else if(playerMove.equals("s")){
                if(computerMove.equals("p")){
                    System.out.println("player wins");
                }else if(computerMove.equals("r")){
                    System.out.println("computer wins");
                }
            }
            System.out.println("play again-(y/n)");
            String playAgain=sc.nextLine();
            if(!playAgain.equals("y")){
                break;
            }
        }

    }
}
