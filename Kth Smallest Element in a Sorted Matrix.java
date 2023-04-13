import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public  static int[] nextPermutation(int[] A) {
       //Write your code here
		
		int n=A.length;
		int i=n-2;
		while(i>=0 && A[i]>=A[i+1])
			i--;
		if(i>=0){
			int j=n-1;
			while(A[i]>=A[j])
				j--;
			swap(A,i,j);
		}
		reverse(A,i+1,n-1);
		return A;
    }
	static void swap(int[] A,int i,int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	static void reverse(int[]A,int i,int j){
		while(i<j){
			swap(A,i,j);
			i++;
			j--;
		}
	}

	
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[] = nextPermutation(arr);
        for(int i=0;i<N;i++)
        {
            System.out.print(result[i]+" ");
        }
	}
}
