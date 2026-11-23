import java.util.Scanner;

public class if_cases {
    /*
    public static void main(String[] args) throws Exception {
        //leap years: can divide by 400 or can divide by 4 and not by 100

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        boolean isLeap = false;

        if(year%4 == 0) 
            isLeap = true;
        else if((year%4 == 0) && (leto%100 != 100))
            isLeap = true;
        else
            isLeap = false;


        if(isLeap) //true 
            System.out.print("it's a leap year");
        else
            System.out.print("isn't a leap year")
        


    }
*/

/*
    public static void main(String[] args) throws Exception {
        //calculator with basic functions

        Scanner input = new Scanner(System.in);
        System.out.println("first number:");
        int number1 = input.nextInt();
        System.out.println("second number:");
        int number2 = input.nextInt();

        System.out.println("Pick: 1(+), 2(-), 3(*), 4(/)");
        int choice = input.nextInt();
        double result = 0;
        boolean error = false;

        switch(choice)
        {
            case 1: result = number1+number2; break;
            case 2: result = number1-number2; break;
            case 3: result = number1*number2; break;
            case 4: result = (double)number1/number2; break; //casting: if I want to temporarily turn int into double
            default: error = true;
        }
        
        if(error)
            System.out.print("error");
        else
            System.out.print(result);

    }
}

*/

/*
    public static void main(String[] args) throws Exception {
        //calculates month and day based on a number, for ex. 234= june 24th (not a leap year)

        Scanner input = new Scanner(System.in);
        System.out.println("number of the day");
        int number = input.nextInt();
        boolean error = false;
        int month = 0;
        int day = 0;

        if(number <= 31) { //january
                    month = 1;
                    day = number;
                } 
        else if(number <= 31+28) { //february
            month = 2;
            day = number-31;
        }
        else if(number <= 31+28+31) { //march
            month = 3;
            day = number-(31+28);
        }
        else if(number <= 31+28+31+30) {  //april
            month = 4;
            day = number-(31+28+31);
        }
        this is still a work in progress prof. we can finish it by figuring out tables in our spare time
    */
    public static void main(String[] args) throws Exception {
        //biggest number of 3 using 2 if cases

        Scanner input = new Scanner(System.in);
        System.out.println("first number:");
        int a = input.nextInt();
        System.out.println("second number");
        int b = input.nextInt();
        System.out.println("third number:");
        int c = input.nextInt();

        int max = a;
        if (b>max) max=b;
        else if (c>max) max=c;

    }
}

}
