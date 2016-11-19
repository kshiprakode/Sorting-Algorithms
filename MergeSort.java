import java.util.*;

class MergeSort{

	public static void mergeSort(int []arr, int low, int high){

		if(low < high)
		{
			int mid = (high + low)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void merge(int[] arr, int low, int mid, int high)
	{
		int i,j,k;
		int sizeL = mid - low + 1;
		int sizeR = high - mid;

		int []L = new int[sizeL];
		int []R = new int[sizeR];

		for(i = low, k = 0; i <= mid; i++,k++)
		{
			L[k] = arr[i];
		}
		for(i = mid+1, k = 0; i <= high; i++,k++)
		{
			R[k] = arr[i];
		}


		System.out.println("L " + Arrays.toString(L));

		System.out.println("R " + Arrays.toString(R));

		i = 0;
		j = 0;
		k = low;
		while(i < L.length && j < R.length)
		{
			if(L[i] > R[j])
			{
				arr[k] = R[j];
				j++;
			}
			else
			{
				arr[k] = L[i];
				i++;
			}
			k++;
		}
		while(i < L.length)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < R.length)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}


	public static void main(String []args)
	{
		int[] arr = {5,3,1,2,4};
		mergeSort(arr,0,arr.length-1);
	}



}