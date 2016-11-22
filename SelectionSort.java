import java.util.*;

class SelectionSort{

	public static void selectionSort(int []arr){

		int minIndex;
		int swap = 0;

		for(int i = 0; i < arr.length; i++)
		{
			minIndex = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			if(i != minIndex)
			{
				swap++;
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("Swaps - " + swap);
		

	}


	public static void main(String []args)
	{
		int[] arr = {6,2,5,3,4,1};
		selectionSort(arr);
	}



}