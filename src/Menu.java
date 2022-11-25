import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public void displayMenu() {
        int choice = 0;
        int choiceBooking = 0;
        System.out.println("_____________________________");
        System.out.println(" |Welcome to our Swim club|");
        System.out.println(" | 1- Create a new User   | ");
        System.out.println(" | 2- Swim Discipline    |");
        System.out.println(" | 3- Payment             | ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println(" You choice to create a new user");
                System.out.println("|                |");
                System.out.println("|                |");
                System.out.println("|                |");
                choice = input.nextInt();
                choice = choiceBooking;
            case 2:
                System.out.println("You choice Swim Disciplin");
                System.out.println("|                |");
                System.out.println("|                |");
                System.out.println("|                |");
                choice = input.nextInt();
                choice = choiceBooking;
            case 3:
                System.out.println("You choice Payment");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                choice = input.nextInt();
                choice = choiceBooking;


        }


    }
}
