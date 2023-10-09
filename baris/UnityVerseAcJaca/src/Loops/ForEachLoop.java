package Loops;

public class ForEachLoop {
    public static void main(String[] args) {
       // ref: https://www.programiz.com/java-programming/enhanced-for-loop

            //for(dataType item : array) {
            //    ...
            //}


        // create an array
        int[] numbers = {3, 9, 5, -5};

        // for each loop
        for (int number : numbers) {
            System.out.println(number);
        }


        //declaring an array
        int arr[]={12,13,14,44};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);
        }



        int total=0;
        for(int i:arr){
            total=total+i;
        }
        System.out.println("Total: "+total);




    }
}
