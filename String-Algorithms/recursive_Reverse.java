/* How to print the reverse of a String using recursion
*/

public class recursive_Reverse
{
	public static void main(String [] args)
	{
		String s1 = "whats going on";
		recursive_Reverse obj = new recursive_Reverse();
		obj.reverse(s1);
	}

	public static void reverse(String str)
	{
		if((str==null)||(str.length() <= 1))
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
}