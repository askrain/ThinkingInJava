package com.stem.arrays;


import java.util.Arrays;

public class Test {

    public static void main(String[] args){
        int[][] a ={{1,3,5},{2,4,6}};//[[I@74a14482, [I@1540e19d]
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------");
        System.out.println(Arrays.deepToString(a));//[[1, 3, 5], [2, 4, 6]]

        int [][][] b=new int[2][3][4];
        System.out.println("多维数组b toString： "+Arrays.deepToString(b));//[[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]]

        String[] strs1 =new String[10];
        Arrays.fill(strs1,"night");
        System.out.println(Arrays.toString(strs1));

        String[] strs2 =new String[12];
        Arrays.fill(strs2,"hello");
        /**
         * 1.源数组
         * 2.从源数组的什么位置开始复制
         * 3.目标数组 ，被填充的数组
         * 4.从目标数组的什么位置开始替换
         * 5.需要复制的元素的个数
         */
        System.arraycopy(strs1, 2,strs2,3,4);
        System.out.println(Arrays.toString(strs2));



    }
}
