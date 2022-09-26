import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Die terning1 = new Die();
        Die terning2 = new Die();
        boolean playerTurn = true; // True betyder at det er player 1's tur, false er player 2's tur
        int terningSum;
        int player1Points = 0, player2Points = 0;

        Scanner scan = new Scanner(System.in);

        while (player1Points < 40 && player2Points < 40){ // Køre loop så længe at begge spiller har under 40 points


            if (playerTurn == true){
                System.out.println("Player 1's tur:");

            }
            else if (playerTurn == false){
                System.out.println("Player 2's tur:");
            }

            System.out.println("Tryk på 'Enter' for at kaste med terningerne");
            scan.nextLine();

            System.out.println();

            terning1.roll();
            terning2.roll();

            terningSum = terning1.roll() + terning2.roll();


            System.out.println("Terning 1 viser: "+ terning1.getFaceValue() );
            System.out.println("Terning 2 viser: "+ terning2.getFaceValue() );
            System.out.println("Summen af terningernes værdi: "+ terningSum);
            System.out.println();


            if (playerTurn == true){
                player1Points += terningSum; // Tilføjer summen af terningerne til spiller 1' points
                System.out.println("Player 1's samlede points: "+ player1Points);
                playerTurn = false;
            }

            else if (playerTurn == false) {
                player2Points += terningSum; // Tilføjer summen af terningerne til spiller 2' points
                System.out.println("Player 2's samlede points: "+ player2Points);
                playerTurn = true;
            }


            System.out.println();
            System.out.println();
            System.out.println();
        }



        if (player1Points >= 40 && player2Points >= 40){
            System.out.println("Det er uafgjort!");
        }

        else if(player1Points >= 40){
            System.out.println("Player 1 vinder!");
        }

        else if (player2Points >= 40) {
            System.out.println("Player 2 vinder!");
        }

    }
}

// mohammad
