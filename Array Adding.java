https://course.acciojob.com/idle?question=281f855c-1a46-4dfb-9239-79478b2c24ea




// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
    // your code here
	  long temp=0;
	  for(int i=0;i<n;i++){
		  temp=temp*10+a[i];
	  }
	  long temp2=0;
	    for(int j=0;j<m;j++){
		  temp2=temp2*10+b[j];
	  }
	  temp+=temp2;
	  int siz=0;
	 long x=temp;
	  while(x>0){
		  siz++;
		  x=x/10;
	  }
	  int arr[]=new int[siz];
	  for(int i=1;i<=siz;i++){
		  arr[siz-i]=(int)(temp%10);
		  temp=temp/10;
		
	  }
	  return arr;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
