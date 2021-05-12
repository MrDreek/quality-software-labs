package com.lab27;

import static com.lab27.ArrayService.*;

public class Main {

    public static void main(String[] args)  {
        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("N not be passed");
            return;
        }

        Integer[][] arr = generateArray(N);

        var a = flatten(arr).mapToInt(i -> (Integer)i).toArray();
        var avg = findAverage(a);
    }
}