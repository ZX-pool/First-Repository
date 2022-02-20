//Application

package main;

public class Application {
    public static void main(String[] args) {


        System.out.println("first 55 elements of sequence 1, 3, 5, 7 ....");
        int number = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(number);
            number += 2;
        }

        System.out.println("all not negative numbers of sequence  90, 85, 80, ...");
        number = 90;
        while (number >= 0) {
            System.out.println(number);
            number -= 5;
        }

        int n = -8;
        if (n % 2 == 0) {
            System.out.println("number " + n + " is paired");
        } else {
            System.out.println("number " + n + " is not paired");
        }

        double[] x = {-8.5, 11.7, 23.5, -19.5};
        double min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i] - 10) < Math.abs(min - 10)) {
                min = x[i];
            }
        }
        System.out.println("min number from array x is = " + min);



    }
}
