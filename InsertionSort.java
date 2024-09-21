import java.util.*;
public class Main
{
    public static  void insertion_sort(int n,int arr[])
    {
       for(int i=1;i<n;i++)
       {
           int key=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>key)
           {
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
       }
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Before Insertion Sort : ");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    insertion_sort(n,arr);
	    System.out.println("After Insertion Sort : ");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
		
	}
}