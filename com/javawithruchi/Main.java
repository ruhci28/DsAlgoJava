package com.javawithruchi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Ruchi");
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(numbers2));

        int[][][] num3 = new int[2][3][4];
        System.out.println(Arrays.deepToString(num3));
    }
}
