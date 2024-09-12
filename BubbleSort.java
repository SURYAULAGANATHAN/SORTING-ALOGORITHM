import java.util.*;
class Main
{
    public static void sort(int n,int arr[])
{
    
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Before Bubble Sort : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        sort(n,arr);
        System.out.print("After Bubble Sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //System.out.println("Try programiz.pro");
    }
}