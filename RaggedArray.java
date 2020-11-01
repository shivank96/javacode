import java.util.*;
public class RaggedArrays {
	public static void main(String[] args) {
		int a[][]=new int[3][];
		a[0]=new int[]{5,6,7};
		a[1]=new int[2];
		a[2]=new int[]{8,9,10,11,12};
		Scanner s=new Scanner(System.in);
			for(int i=1,j=0;j<a[1].length;j++)
				a[i][j]=s.nextInt();
			for(int x[]:a)
			{
			for(int y:x)
					System.out.print(y+" ");
			System.out.println();
			}
	}
}
