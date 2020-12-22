import java.util.Scanner;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int a = 2;

        /* Array Properties
        1. Homogeneous (same type, int, string, double, etc)
        2. Fixed length
         */

        int[] b = {1, 2, 3, 5, 10, 24, 6};
        String[] c = new String[4];  //leaves 4 empty slots

        System.out.println("Third element is" + b[3]);

        b[1] = 30;
        System.out.println("Second element is" + b[1]);
        System.out.println("Last element is" + b[b.length - 1]);

        double[] grades = {92.5, 88.2, 75.0, 100.0, 90.9};
        double sum = 0;

        // for (initialization; condition; afterthought)
        for (int i = 0; i < grades.length; i++) {
            //create variable i
            //is i less than the length, then run
            //increase i by 1 to the next grade

            sum += grades[i];

            //I don't know why

            System.out.println("Sum:" + sum);
            System.out.println("Average:" + sum / grades.length);
        }

        String word = "alpha";
        System.out.println(word.toUpperCase());

        //Practice

        String[] words = {"alpha","bravo","charlie","delta"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].toUpperCase());
        }
    }
}
