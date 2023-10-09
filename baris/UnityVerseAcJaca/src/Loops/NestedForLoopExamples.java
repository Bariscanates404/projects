package Loops;

import java.util.Scanner;

public class NestedForLoopExamples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1 ile 10 arasında bir rakam giriniz...");
        int sayi = scan.nextInt();

        nestedForLoopExample(sayi);

        for (int i = 1; i <=sayi ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <=sayi-1 ; i++) {

            for (int j = 1; j <=sayi-i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    private static void nestedForLoopExample(int sayi1) {

        for (int i = 1; i <= sayi1; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print("* ");


            }
            System.out.println("");

        }

    }


}
