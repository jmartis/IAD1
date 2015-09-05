package week_1;

import java.util.Arrays;

public class QuickSort  {
	  private int[] numerals;
	  private int number;

	  public static void main(String[] args){
		  int[] input = { 7,4,8,1,2,4 };
		  QuickSort qs = new QuickSort();
		  qs.sort(input);
		System.out.println(Arrays.toString(input));

	  }
	  
	  public void sort(int[] values) {
	    // check for a null or empty array
	    if (values ==null || values.length==0){
	      return;
	    }
	    this.numerals = values;
	    number = values.length;
	    quicksort(0, number - 1);
	  }

	  private void quicksort(int low, int high) {
	    //Schrijf hier je eigen quicksort implementatie
	  }

	  private void swap(int i, int j) {
	    int temp = numerals[i];
	    numerals[i] = numerals[j];
	    numerals[j] = temp;
	  }
	} 
