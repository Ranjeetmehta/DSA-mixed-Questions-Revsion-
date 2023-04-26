https://course.acciojob.com/idle?question=8bff3159-40be-4f88-92f0-5c844894b12e

// Java program to print largest contiguous array sum
import java.util.*;

public class Main {

  // Driver Code
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    sc.close();
    System.out.println(maxSubArraySum(arr));
  }

  // Function Call
  static int maxSubArraySum(int a[]) {
    // your code here
	  int n=a.length;
	  int max=Integer.MIN_VALUE;
	  int sum=0;
	  for(int i=0;i<n;i++){
		  sum=sum+a[i];
		  max=Math.max(sum,max);
		  if(sum<0)
			  sum=0;
	  }
	  return max;
  }
}








