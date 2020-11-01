public class Array1 {
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		//assigning values in array after creation
		arr[0]=11;arr[1]=12;arr[2]=13;arr[3]=14;arr[4]=15;
		for(int x:arr)
			System.out.println(x);
		System.out.println("------------------------------------------");
		//initializing array directly
		int []arr1= {21,22,23,24,25};
		for(int x:arr1)
			System.out.println(x);
		System.out.println("------------------------------------------");
		//array initializers while creation of a 1-d array
		int arr2[]=new int[]{31,32,33,34,35};
		for(int x:arr2)
			System.out.println(x);
		System.out.println("------------------------------------------");
		//accessing particular index value
		System.out.println(arr2[1]);
		System.out.println("------------------------------------------");
		//array initializers while creation of a 2-d array
		int[] []a= new int[][]{{5,4,3,2,1},{6,7,8,9,10}};
		
		for(int x[]:a)
			for(int y:x)
			System.out.println(y);
		System.out.println("------------------------------------------");
		//accessing particular index value
		System.out.println(a[1][4]);
	}
}
