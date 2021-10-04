package week1.day2;

import java.util.Arrays;

public class Array_FindLarestandSmallestElement {
	
public static void main(String[] args) {
	
    //initialize the array
	int[] numArr= {100,49,398,34,1,267};
	
	//length of array
	int length = numArr.length;
	
     //display array in console
	System.out.println("Default array");
	
	for(int i=0; i<numArr.length; i++)
	{
		System.out.println(numArr[i]);	
	}
	
	//sorting array
	Arrays.sort(numArr);
	System.out.println("Sorted array");
	for (int i = 0; i < numArr.length; i++) {
		
		System.out.println(numArr[i]);
		
	}
	//2nd largest number
	System.out.println("Second largest number is :" + numArr[length-2]);
	
	//2nd smallest number
	System.out.println("Second smallest number is :" + numArr[1]);
	
	//1st element of array
	System.out.println("First element of array is :" + numArr[0]);
	
	//Last element of array
	System.out.println("Last element of array is :" + numArr[length-1]);
	
	}
	
}

