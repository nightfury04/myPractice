package com.algorithms.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		BubbleSort sort = new BubbleSort();
		System.out.println("\nBefore sorting : ");
		sort.displayArray(arr);
		System.out.println("\nAfter sorting : ");
		sort.bubbleSort(arr);
		sort.displayArray(arr);

	}
	
	
	public void bubbleSort(int[] arr) 
	{
		int n = arr.length;
		for(int i=0; i<n-1; i++) 
		{
			for(int j=0; j<n-i-1; j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public void displayArray(int[] arr) 
	{
		for(int i : arr) 
		{
			System.out.print(i+" ");
		}
	}
	

}
