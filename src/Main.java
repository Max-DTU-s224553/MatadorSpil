import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Die terning1 = new Die();
        Die terning2 = new Die();
        int sum;

        //terning1.roll();git
        //terning2.roll();

        sum = terning1.roll() + terning2.roll();

        System.out.println("Terning 1 viser: "+ terning1.getFaceValue());
        System.out.println("Terning 2 viser: "+ terning2.getFaceValue());
        System.out.println("Summen af terningernes værdi: "+ sum);

    }
}
//Ali
