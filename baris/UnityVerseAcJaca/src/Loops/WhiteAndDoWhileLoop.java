package Loops;

public class WhiteAndDoWhileLoop {
    public static void main(String[] args) {

        int i = 0;
        int y=0;

        do {
            System.out.println(i);
            i++;
        }while (i<5);

        System.out.println("-----------------------");


        do {
            System.out.println(y);
            y++;
        }while (y<0);

        System.out.println("-----------------------");



        int  baslangic = 40;
        int bitis=60;

        int x=baslangic;
        while (x<=bitis){
            System.out.print(x + " ");
            x++;
        }

        System.out.println("-----------------------");

        int k=baslangic;
        do {
            System.out.print(k + " ");
            k++;
        }while (k<=bitis);














    }
}
