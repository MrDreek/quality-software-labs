package com.lab27;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class ArrayService {
    public static Integer[][] generateArray(int N) {
        Integer[][] arr = new Integer[N][N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = random.nextInt(99 - 10) + 10;
            }
        }

        return arr;
    }


    public static Stream<Object> flatten(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[]? flatten((Object[])o): Stream.of(o));
    }

    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
}
