public class duplicate_In_String
{
	public static void main(String [] args)
	{
		String s1 = "tester String";
		duplicatePrinter(s1);
	}

	/* this method fills an array with a frequency of characters */
	public static void fillCharacters(String str, int[] count)
	{
		for(int i = 0; i < str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
	}

	/* this method will print the duplicates in the string */
	public static void duplicatePrinter(String str)
	{
		/* if we create an array of 256 and fill it with every character */
		int [] array = new int [256];
		fillCharacters(str, array);

		for(int i = 0; i < 256; i++)
		{
			if(array[i] > 1)
			{
				System.out.printf("%c, count = %d \n", i, array[i]);
			}
		}
		/* the printf is print formatter 
		* %c will give the character
		* %d will give the decimal(integer) number 
	}
}