/* 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int nrExecutii, threadInchis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number between 1 to 10: ");
        nrExecutii = sc.nextInt();
        for (int i = 1; i <= nrExecutii; i++) {
            thread thread = new thread(i);
            thread.start();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("which thread do you want to close?");
        threadInchis = sc.nextInt();
        System.out.println("Thread " + threadInchis + " was cancelled!");
        sc.close();
    }
}
*/

//Problema 2

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un cuvânt:");
        String cv = sc.nextLine();
        System.out.println("Cuvantul are "+cv.length()+" litere!");
        int mijloc = cv.length() / 2; 

        stangadreapta leftThread = new stangadreapta(cv, mijloc);
        dreaptastanga rightThread = new dreaptastanga(cv, mijloc);

        leftThread.start();
        rightThread.start();
    }
}
