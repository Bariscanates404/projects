package ArrayArrayList;

import java.util.Arrays;

public class array02 {
    public static void main(String[] args) {

        String arr[] = {"baris", "can", "ates"};
        System.out.println(arr);     // ---> @372f7a8d reference
        System.out.println(Arrays.toString(arr));  // ---> [baris, can, ates]

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[arr.length - 1]);  // length 1 den başlar, index 0 dan başlar bu nedenle length indexe dönüştürmek
        // için length - 1 = index formulunu kullaniriz.

        int arr1[] = {1, 2, 34, 5, 67, 8, 89, 566, 43, 42, 34, 345, 45, 5, 758};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

        arr[0] = "burak";
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String str="java ogrenmek eger isterseniz ve tabii ki calisirsaniz cok kolay.";
        String strArr[]=str.split(" ");
        System.out.println(Arrays.toString(strArr));

        String str2="javaogreniyoruzolacakbuisboylegiderse";
        String strArr2[]=str2.split("");
        System.out.println(Arrays.toString(strArr2));







    }
}
