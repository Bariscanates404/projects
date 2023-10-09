package MethodCreation;

import java.util.Scanner;

public class MethodCreationExmples {


    public static void main(String[] args) {

        //onKezYazdir("merhabaLoopDunyasi");
        //infiniteLoop("sonsuz dongu!!!");
        //bozukLoopCondition();


        //kullanıcıdan 1 ile 100 arasında bir sayı girmesini isteyin sonra kullanıdıcan 1 ve 10 arasında ikinci bir sayı girmesini siteyin. birinci rakamın
        //icerisinde bulunan ikinci rakamın katları olan butun sayilari yazdirin.


        Scanner scan = new Scanner(System.in);


        System.out.println("1. sayi 1 ile 100 arasında 2. sayi 1 ile 10 arasıdna olsun.");
        example1(scan.nextInt(), scan.nextInt());


    }

    private static void example1(int bolunecekSayi, int sayi2) {
        for (int i = 1; i <= bolunecekSayi; i++) {

            if (i % sayi2 == 0) {
                System.out.println(i + " ");
            }

        }


    }


    private static void infiniteLoop(String str1) {

        int counter = 0;

        for (int i = 0; i >= 0; i++) {

            System.out.println(str1 + ": " + counter);
            counter++;


        }

    }


    private static void onKezYazdir(String str1) {

        for (int i = 0; i < 3; i++) {

            System.out.println(str1);


        }


    }

    private static void bozukLoopCondition() {

        for (int i = 0; i > 5; i++) {

            System.out.println("calısmadi");


        }


    }


}

