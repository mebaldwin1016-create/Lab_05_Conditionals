import java.util.Scanner;

public class Task3_PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String politicalParty = "";
        String menu = "D - Democrat\tR - Republican\tI - Independent\tO - Other\nWhat's your political party? [D, R, I, O]: ";

        System.out.println(menu);
        politicalParty = in.nextLine();

        politicalParty = politicalParty.toUpperCase();

        switch (politicalParty)
        {
            case "D":
                System.out.println("You get a democratic donkey");
                break;
            case "R":
                System.out.println("You get a republican elephant");
                break;
            case "I":
                System.out.println("You get a independent person");
                break;
            case "O":
                System.out.println("You chose OTHER");
                break;
            default:
                System.out.println("Illegal Choice: " + politicalParty);
                break;
        }
    }
}
