import java.util.*;

class BubbleSort{

	public static void bubbleSort(int []arr){

		int comparison = 0;
		int swap = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-i-1; j++)
			{
				comparison++;
				if(arr[j+1] < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++;
				}
			}
		System.out.println(Arrays.toString(arr));
		}

		System.out.println("Comparison - " + comparison +"\nSwap " + swap);
		

	}


	public static void main(String []args)
	{
		int[] arr = {5,3,1,2,4};
		bubbleSort(arr);
	}



}