package org.soneech.tasks.variant6.examples;

import java.util.Arrays;

public class ExampleBucketSort {

    public static void main(String[] args) {
        int[] num = { 3,6,1,7,2,8,10,4,9,5,8,10};
        int n = num.length;
        System.out.println(Arrays.toString(num));
        bucketSort(num);

        for (int h = 0; h < n; h++)
            System.out.print(num[h]+ " ");
    }

    public static int[] bucketSort(int[] arr) {
        int i, j;
        int[] bucket = new int[arr.length+1];
        Arrays.fill(bucket, 0);
        for (i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        System.out.println(Arrays.toString(bucket));

        int k = 0;
        for (i = 0; i < bucket.length; i++) {
            for (j = 0; j<bucket[i]; j++) {
                arr[k++] = i;
            }
        }
        return arr;
    }
}