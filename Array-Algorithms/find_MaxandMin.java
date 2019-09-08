public class find_MaxandMin
{
	public static void main(String[] args)
	{
		int [] array = {50,8,59,87,4,68,15,2,48,64,2,7,0};
		//int getMax = findMax(array);
		System.out.println(findMax(array));
		System.out.println(findMin(array));

	}

	public static int findMax(int[]a)
	{
		int max = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}

	public static int findMin(int[]b)
	{
		int min = b[0];
		for(int i = 0; i <b.length; i++)
		{
			if(b[i] < min)
			{
				min = b[i];
			}
		}
		return min;
	}
}