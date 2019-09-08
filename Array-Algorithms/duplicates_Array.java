/* You are given an array of n+2 elements. 
* All elements of the array are in range 1 to n. 
* And all elements occur once except two numbers which occur twice. 
* Find the two repeating numbers.
* For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5
* The above array has n + 2 = 7 elements with all elements occurring once
* except 2 and 4 which occur twice. So the output should be 4 2.
*/

public class duplicates_Array
{
	public static void main(String[] args)
	{
		int [] array = new int [] {7,82,789,78,54,7,9,28,82,64,86,9};
		System.out.println("The duplicate elements are");

		//for loop to search for the duplicates
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[i] == array[j])
				{
					System.out.print(array[j]+",");
				}
			}
		}
	}
}