package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
        int i = array.length;
        boolean [] result = new boolean[i];

        if ((i !=0)||(array != null)){
            result[0]  = false;
            result[1] = false;
            for (int k = 2; k < i; k++){
                if (array[k] == array[k-1]+array[k-2]){
                    result[k] = true;
                }
                else if (array[k] != array[k-1]+array[k-2]){
                    result[k] = false;
                }
            }
        }
        //throw new UnsupportedOperationException();
        return result;
    }
}
