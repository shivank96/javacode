import java.util.*;
public class Arrays 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,max=0,smax=0,sum=0,arr[]=new int[5];//creating an array 
		System.out.println("Enter the values");
		//Entering values in a fix sized array
		for(int i=0;i<arr.length;i++)
		{	
			arr[i]=s.nextInt();
			
			if(arr[i]>max)
			{
			    max=arr[i];		
			}
			//summing up all the values entered in an array
			sum+=arr[i];
		}
		max=smax=arr[0];
		//Finding maximum and second maximum of  array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println("sum is "+sum+" Max is "+max+" Second max is "+smax);
		System.out.println("Enter an element which you want to search for ");
		a=s.nextInt();
		//Searching an element from an array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				System.out.println("Element found at index "+i);
			}	
		}
		System.out.println("Element not found");
		System.out.println("Right rotation");
		//rotation of an array
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		//Accessing all the values of an array using for each loop
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}
