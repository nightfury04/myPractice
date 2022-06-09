package com.algorithms.sorting;

public class SelectionSort {

    public static void main(String args[]) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(new Integer[]{5, 10, 2, 3, 1});
    }


    public void selectionSort(Integer arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int leastIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[leastIdx] > arr[j]) {
                    leastIdx = j;
                    System.out.println(" Least index is : " + leastIdx);
                }
            }
            //swap the two elements as we have determined which is the smallest integer in the array and at what position
            int tempVar = arr[i];
            arr[i] = arr[leastIdx];
            arr[leastIdx] = tempVar;
        }
        System.out.print(" Sorted array is : ");
        displayArray(arr);
    }

    public void displayArray(Integer[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

}
