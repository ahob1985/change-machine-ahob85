import java.util.Scanner;

/**
 * Write a description of class ChangeMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChangeMachine
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Change Machine!");
        System.out.print("Please enter cents as a positive integer: ");
        int cents = Integer.parseInt(sc.nextLine());
        System.out.println(cents + " cents makes:");
        int quarters = cents / 25;
        cents = cents - quarters * 25;
        int dimes = cents / 10;
        cents = cents - dimes * 10;
        int nickels = cents / 5;
        cents = cents - nickels * 5;
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(cents + " pennies");
    }

}
