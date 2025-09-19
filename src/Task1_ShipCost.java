import java.util.Scanner;

public class Task1_ShipCost {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double FREE_SHIP_LIMIT = 100;
        final double SHIP_RATE = .02;
        String newLine = "";
        String trash = "";

        System.out.println("What's your item price?");

        if(itemCost >= FREE_SHIP_LIMIT)
        {
            shipCost = 0;
        }
		else
        {
            shipCost = itemCost * SHIP_RATE;
        }


    }
}