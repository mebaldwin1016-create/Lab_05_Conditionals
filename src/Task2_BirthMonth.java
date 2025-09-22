import java.util.Scanner;

public class Task2_BirthMonth {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String newLine = "";
        String trash = "";

        System.out.println("What's your birth month?");

        birthMonth = in.nextInt();

        if(birthMonth < 1 || birthMonth > 12)
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
        else
        {
            System.out.println("Your birth month is: " + birthMonth);
        }


    }
}
