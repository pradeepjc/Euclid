package main.java;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int x = generateRandomInt();
        int y = generateRandomInt();

        System.out.println("First integer is " + x);
        System.out.println("Second integer is " + y);
        if (x == 0 || y == 0) {
            System.out.println("inputs can not contain 0!");
            return;
        }
        if (x == y) {
            System.out.println("The GCD is " + x);
            return;
        }
        int m = x > y ? x : y;
        int n = x > y ? y : x;
        int r = getModValue(m, n);
        if (r == 0) {
            System.out.println("The GCD is " + n);
            return;
        }
        int gcd = 0;
        while (r != 0) {
            gcd = r;
            m = n;
            n = r;
            r = getModValue(m, n);
        }

        System.out.println("The GCD is " + gcd);
    }

    private static int generateRandomInt() {
        Random random = new Random();
        //for the purposes of proving the algorithm the generated integers are between 0 and 100
        return random.nextInt(100);
    }

    private static int getModValue(int a, int b) {
        return a % b;
    }
}

