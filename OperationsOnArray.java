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
                //Increasing the size of an array
		System.out.println("The size of array "+arr.length);
		int brr[]=new int[arr.length*2];
		int i=0;
		//Copying the values from one array to another
		for(int x:arr)
		{
			brr[i++]=x;	
		}
		arr=brr;
		//initializing the values in extended array
		System.out.println("Enter the reamining values ");
		for(int j=arr.length/2;j<arr.length;j++)
		{
			arr[j]=s.nextInt();
		}
		System.out.println("The size of array "+arr.length);
		//Accessing all the values of an array using for each loop before reverse copying
		System.out.println("Before revere copying the array");
				for(int x:arr)
				{
					System.out.println(x+" ");
				}
		//Reverse copying the values in an array to another
				int crr[]=new int[arr.length];
				for(int k=arr.length-1,j=0;k>=0;k--,j++)
				{
					crr[j]=arr[k];
				}
				arr=crr;
				System.out.println("After revere copying the array and assigning back to same array");;
				for(int x:arr)
				{
					System.out.println(x);
				}

	}
}
