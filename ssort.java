package program4;
class Selectionsort
{
	   void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	        {
	       	    int min_idx = i;
	            for (int j = i+1; j < n; j++){
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	            }
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
}
public class ssort{
    public static void main(String args[])
	    {
    		Selectionsort ob = new Selectionsort();
	        int arr[] = {64,25,12,22,11};
	        long start_time=System.currentTimeMillis();
	        ob.sort(arr);
	        long end_time=System.currentTimeMillis();
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	        System.out.println("\nTime taken="+(end_time-start_time)+"  Milli seconds");
	    }
	}