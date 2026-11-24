//23.11.2026, tue

import java.util.Scanner;

public class loops {

    /*
    public static void main(String[] args) throws Exception {
        //  *
        //  **
        //  ***
        //  ****
        //  ***** 

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++)  {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
        */
    /* 
        public static void main(String[] args) throws Exception {
        
        //*****
        //****
        //***
        //**
        //*

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++)  {
            for(int j=1; j<=(n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
        */

        public static void main(String[] args) throws Exception {
        //    *
        //   **
        //  ***
        // ****
        //*****

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++)  {
            for(int j=1; j<=n; j++) {
                if(j<=(n-i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}

