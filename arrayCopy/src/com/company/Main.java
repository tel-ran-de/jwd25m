package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	   int[] array = {0,1,2,3,4,5};
	   int index=3;

	   System.arraycopy(array,index+1,array,index,array.length-index-1);
	   array=Arrays.copyOf(array,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
