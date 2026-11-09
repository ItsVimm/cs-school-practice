import java.util.Scanner;

public class pogojni_stavki {
    /*
    public static void main(String[] args) throws Exception {
        //prestopno leto: deljivo s 400 ali deljivo s 4 in ne s 100

        Scanner vnos = new Scanner(System.in);
        int leto = vnos.nextInt();

        boolean jePrestopno = false;

        if(leto%4 == 0) 
            jePrestopno = true;
        else if((leto%4 == 0) && (leto%100 != 100))
            jePrestopno = true;
        else
            jePrestopno = false;


        if(jePrestopno) 
            System.out.print("je prestopno");
        else
            System.out.print("ni prestopno leto")
        


    }
*/

/*
    public static void main(String[] args) throws Exception {
        //kalkulator z osnovnimi funkcijami

        Scanner vnos = new Scanner(System.in);
        System.out.println("prvo število:");
        int s1 = vnos.nextInt();
        System.out.println("drugo število");
        int s2 = vnos.nextInt();

        System.out.println("Izberi: 1(+), 2(-), 3(*), 4(/)");
        int izbira = vnos.nextInt();
        double rezultat = 0;
        boolean napaka = false;

        switch(izbira)
        {
            case 1: rezultat = s1+s2; break;
            case 2: rezultat = s1-s2; break;
            case 3: rezultat = s1*s2; break;
            case 4: rezultat = (double)s1/s2; break; //casting: če hočeš intiger samo začasno spremenit v float ali double castaš
            default: napaka = true;
        }
        
        if(napaka)
            System.out.print("napaka");
        else
            System.out.print(rezultat);

    }
}

*/

/*
    public static void main(String[] args) throws Exception {
        //mesec in dan v letu glede na stevilo

        Scanner vnos = new Scanner(System.in);
        System.out.println("število dneva");
        int stevilo = vnos.nextInt();
        boolean napaka = false;
        int mesec = 0;
        int dan = 0;

        if(stevilo <= 31) { //januar
                    mesec = 1;
                    dan = stevilo;
                } 
        else if(stevilo <= 31+28) { //februar
            mesec = 2;
            dan = stevilo-31;
        }
        else if(stevilo <= 31+28+31) { //marec
            mesec = 3;
            dan = stevilo-(31+28);
        }
        else if(stevilo <= 31+28+31+30) {  //april
            mesec = 4;
            dan = stevilo-(31+28+31);
        }
        else if(stevilo <= 31+28+31+30+31) { //maj
            mesec = 5;
            dan = stevilo-(31+28+31+30);
        }
        else if(stevilo <= (31+28+31+30+31)) {  //junij
            mesec = 6;
            dan = stevilo-(31+28+31+30);
        }
        else if(stevilo <= (31+28+31+30+31+31)) { //julij
            mesec = 7;
            dan = stevilo-(31+28+31+30+31)
        }
            default: napaka = true;
        }

    }
    */
    public static void main(String[] args) throws Exception {
        //biggest number

        Scanner input = new Scanner(System.in);
        System.out.println("first number:");
        int a = input.nextInt();
        System.out.println("second number");
        int b = input.nextInt();
        System.out.println("third number:");
        int c = input.nextInt();

        int max = 0;

        max =a;
        if (b>max) max=b;
        else if (c>max) max=c;

    }
}

}