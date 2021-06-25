package main.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(0,generateRandomInt());
        intArrayList.add(1,generateRandomInt());

        System.out.println("The first integer is " + intArrayList.get(0));
        System.out.println("The second integer is " + intArrayList.get(1));

        if(intArrayList.contains(0)){
            System.out.println(" 0 is not a valid input for the operation. ");
            return;
        }

        Collections.sort(intArrayList,Collections.reverseOrder());

        while(intArrayList.get(1)!=0){
            int result = getModValue(intArrayList.get(0),intArrayList.get(1));
            intArrayList.set(0,intArrayList.get(1));
            intArrayList.set(1,result);
            if(intArrayList.get(1) == 0){
                System.out.println("The GCD is " + intArrayList.get(0));
                return;
            }
        }
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

