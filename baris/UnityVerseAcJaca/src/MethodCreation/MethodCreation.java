package MethodCreation;

import static MethodCreation.ReusableMethods.toplama;
import static MethodCreation.ReusableMethods.verifyURLorText;

public class MethodCreation {


    public static void main(String[] args) {
        toplama(3, 6);
        System.out.println(verifyURLorText("baris", "baris"));
        int sayi1;
        sayi1=toplamaReturnInt(3,9);
        System.out.println(sayi1);
    }

    public static void toplama(int args1, int args2) {
        System.out.println(args1 + args2);
    }

    public static int toplamaReturnInt(int rakam1, int rakam2) {
        int genelToplam = rakam1 + rakam2;

        return genelToplam;
    }


}
