//03.11.2026, tue (theory)


import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        // Create one shared Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("--- EXERCISE 1: TICKET PRICE ---");
        calculateTicketPrice(input);

        System.out.println("--- EXERCISE 3: GRADE DESCRIPTION ---");
        printGrade();

        // Close the scanner when completely done
        input.close();
    }

    public static void calculateTicketPrice(Scanner input) {
        //calculates ticket price based on age and day (20% price reduction on tuesdays)
        
        System.out.println("Enter age:");
        int age = input.nextInt();

        System.out.println("Enter day:");
        int day = input.nextInt();

        System.out.println("The price is: ");
        if (day == 2) {
            if (age < 12) {
                System.out.print("3.8€");
            } else {
                System.out.print("5.6€");
            }
        } else {
            if (age < 12) {
                System.out.print("4€");
            } else {
                System.out.print("7€");
            }
        }
    }


    public static void printGrade() {
        int grade = 4;

        switch (grade) {
            case 1:
                System.out.println("insufficient");
                break;
            case 2:
                System.out.println("sufficient");
                break;
            case 3:
                System.out.println("good");
                break;
            case 4:
                System.out.println("very good");
                break;
            case 5:
                System.out.println("excellent");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}

