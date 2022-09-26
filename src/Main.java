import java.awt.*;

public class Main {
    public static void main(String[] args) {

        boolean Player1Turn, Player2Turn;

        Die terning1 = new Die();
        Die terning2 = new Die();
        int sum;
        int player1Points = 0, player2Points = 0;

        while (player1Points < 40 && player2Points < 40){ // Køre loop så længe at begge spiller har under 40 points

            System.out.println("Player 1's turn:");
            System.out.println();

            terning1.roll();
            terning2.roll();

            sum = terning1.roll() + terning2.roll();


            System.out.println("Terning 1 viser: "+ terning1.getFaceValue() );
            System.out.println("Terning 2 viser: "+ terning2.getFaceValue() );
            System.out.println("Summen af terningernes værdi: "+ sum);
            System.out.println();

            player1Points += sum; // Tilføjer summen af terningerne til spiller 1' points
            System.out.println("Player 1's samlede points: "+ player1Points);
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
//Ali
//Sofian er sus
