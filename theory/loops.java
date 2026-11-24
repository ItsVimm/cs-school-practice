import java.util.Scanner;

public class loops_theory {
    
    // Create ONE shared Scanner at the class level so every method can use it!
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("--- EXERCISE 1: Even numbers 2-100 ---");
        //evenNumbers(); 

        System.out.println("--- EXERCISE 2: Factorial calculator ---");
        //factorialCalc();

        System.out.println("--- EXERCISE 3: Triangles ---");
        triangles();

        input.close();
    }

    public static void evenNumbers() {
        // Outputs even numbers from 2 to 100
        int j = 2;
        while (j <= 100) {
            System.out.println(j);
            j = j + 2;
        }
    }

    public static void factorialCalc() {
        System.out.println("Enter a number to calculate its factorial:");
        int n = input.nextInt();
        int i = 1;
        int fact = 1;
        
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial result: " + fact);
    }

    public static void triangles() {
        System.out.println("Enter triangle size:");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= n; i--) {
            for (int j = 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
