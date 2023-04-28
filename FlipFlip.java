https://course.acciojob.com/idle?question=1f82c6b4-988d-4474-be30-4a15f898cf69









import java.util.*;

class Solution {
    public int FlipFlip(int n, int[] A,int K) {
        // Write your code here
		int out=0;
		int count=0;
		boolean[] checkFlip=new boolean[A.length];
		for(int i=0;i<A.length;i++){
			// if((A[i]==0 count%2==0 ||(A[i]==1 && count%2!=0)){
			if( (A[i]==0 && count%2==0) || (A[i]==1 && count%2!=0)){	
			count++;
				out++;
				if(i+K-1>=A.length){
					return -1;
				}
				else{
					checkFlip[i+K-1]=true;
				}
			}
			if(checkFlip[i]){
				count--;
			}
		}
		return out;
    }
}
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int k = sc.nextInt();
        sc.close();
        Solution Obj = new Solution();
		int a=Obj.FlipFlip(n,arr,k);
        System.out.print(a+" ");
		}
}
