/*
* Given a list of n-1 integers and these integers are in the range of 1 to n. 
* There are no duplicates in the list. One of the integers is missing in the list. 
* Write an efficient code to find the missing integer.
* - Using sum formula
* Get sum of numbers which is total = n*(n+1)/2
* Subtract all the numbers from the sum and you get the missing number
*
*/

import java.util.*;
public class find_MissingNumber
{
	public static void main(String[] args)
	{
		int [] array = {1,2,4,5,6,7};
		int missing = getMissingNumber(array, 6); //takes the array and its size as parameters
		System.out.println(missing);
	}

	public static int getMissingNumber(int []array, int x)
	{
		int y, total;
		total = (x + 1) * (x+2)/ 2;
		for(y = 0; y < x; y++)
		{
			total -= array[y];
		}
		return total;
	}
}
