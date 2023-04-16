https://course.acciojob.com/idle?question=e30e7e27-5b2e-4f86-8e97-faf8abe752b7

import java.io.*;
import java.util.*;

class Accio {
    public long zeroFilledSubarray(int[] arr,int n) {
        //Write code here and print output
		long ans=0;
		long count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				ans+=++count;
			}
			else count=0;
		}
		return ans;
    }
}

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Accio A= new Accio();
        long ans=A.zeroFilledSubarray(arr,n);

        System.out.println(ans);
        
    }
}
