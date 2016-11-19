import java.util.*;

class InsertionSort{

	public static void insertionSort(int []arr){

		int swap = 0;
		int key = 0,j;
		for(int i = 1; i < arr.length;i++)
		{
			key = arr[i];
			j = i;
			while(j > 0 && arr[j-1] > key)
			{
				arr[j] = arr[j-1];
				swap++;
				j--;
			}
			arr[j] = key;
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("Swaps - " + swap);
		

	}


	public static void main(String []args)
	{
		int[] arr = {5,3,1,2,4};
		insertionSort(arr);
	}



}