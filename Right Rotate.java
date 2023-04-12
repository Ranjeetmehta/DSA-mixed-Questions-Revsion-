question  https://course.acciojob.com/idle?question=0ce5e333-acb5-4999-82d3-329ddda3cb43


import java.util.*;

class Solution {

    public void rightRotate(int[] arr, int n, int k) {
        // write code here
		n=arr.length;
		int[] ans=new int[n];
		for(int i=0;i<n;i++){
			ans[(i+k)%n]=arr[i];
		}
		for(int i=0;i<ans.length;i++){
			arr[i]=ans[i];
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        Obj.rightRotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
