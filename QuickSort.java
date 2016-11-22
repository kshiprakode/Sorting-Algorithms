import java.util.*;

class QuickSort{

	public static void quickSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int pivot = low;
			int i= low;
			int j = high;
			while(i < j)
			{
				while(arr[i] <= arr[pivot] && i < high)
				{
					i++;
				}
				while(arr[j] > arr[pivot])
				{
					j--;
				}
				if(i < j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}

			}

			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;

			quickSort(arr,low,j-1);
			quickSort(arr,j+1,high);
			
		}
		System.out.println(Arrays.toString(arr));

	}


	public static void main(String args[])
	{

		int arr[] = {1,9,2,11,5,7,-9,6};
		quickSort(arr,0,arr.length - 1);
	}
}