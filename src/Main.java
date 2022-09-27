import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Die terning1 = new Die();
        Die terning2 = new Die();
        boolean playerTurn = true; // True betyder at det er player 1's tur, false er player 2's tur

        int testRollTimes = 1000;
        double gennemsnit;
        int terningSum = 0;
        int player1Points = 0, player2Points = 0;

        Scanner scan = new Scanner(System.in);

// ******************************************************************************************************************************************************'
                                     // Terning kast test start
// ******************************************************************************************************************************************************'

        System.out.println();
        System.out.println("Fair terning beregning:");

        for (int i = 0; i < testRollTimes; i++){
            terning1.roll();
            terning2.roll();

            terningSum += terning1.getFaceValue() + terning2.getFaceValue();

            //System.out.print(terning1.getFaceValue() + " ");
            //System.out.println(terning2.getFaceValue());
            //System.out.println();
        }
        gennemsnit = ( (double)terningSum / (double)testRollTimes) / 2;
        System.out.println("Den samlede gennemsnitlig værdi på et enkelt terningkast efter at kaste med spillet 2 terninger "+ testRollTimes + " gange er: "+ gennemsnit);
        System.out.println();
        System.out.println();

// ******************************************************************************************************************************************************'
                                     // Terning kast test slut
// ******************************************************************************************************************************************************'





// ******************************************************************************************************************************************************'
                                                       // Spil start
// ******************************************************************************************************************************************************'

        System.out.println("Terning kast spil:");
        System.out.println("Kast med 2 terninger. Den først spiller der får 40 points vinder!");
        System.out.println();

        while (player1Points < 40 && player2Points < 40){ // Køre loop så længe at begge spiller har under 40 points


            if (playerTurn == true){
                System.out.println("Spiller 1's tur:");

            }
            else if (playerTurn == false){
                System.out.println("Spiller 2's tur:");
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
                System.out.println("Spiller 1's samlede points: "+ player1Points);
                playerTurn = false;
            }

            else if (playerTurn == false) {
                player2Points += terningSum; // Tilføjer summen af terningerne til spiller 2' points
                System.out.println("Spiller 2's samlede points: "+ player2Points);
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
            System.out.println("Spiller 1 vinder!");
        }

        else if (player2Points >= 40) {
            System.out.println("Spiller 2 vinder!");
        }

    }

}
