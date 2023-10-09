package Loops;

public class ForLoopAndNestedForLoop {
    public static void main(String[] args) {
        int input = 3;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {                          //i=1 j=1 1*1 i=1 j=2 1*2 i=1 j=3 1*3  bosluk
                                                                        //i=2 j=1 2*1 i=2 j=2 2*2 i=2 j=3 2*3  bosluk
                System.out.println(i * j + " ");                        //i=3 j=1 3*1 i=3 j=2 3*2 i=3 j=3 3*3  bosluk
            }
            System.out.println("");
        }



        int weeks = 3;
        int days = 7;

        // outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }



    }
}
