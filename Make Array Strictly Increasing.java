https://course.acciojob.com/idle?question=9e29e2b3-f009-4d39-a72b-f9bd6411f987


import java.util.*;

class Solution {

    public int minOperations(int[] a, int[] b) {
        // write code here
		TreeSet<Integer> set=new TreeSet<>();
		for(int i:b) set.add(i);
		int m=a.length;
		int p=Math.min(m,b.length);
		int[] dp=new int[p+1];
		dp[0]=a[0];
		for(int j=1;j<=p;j++){
			dp[j]=Math.min(a[0],set.first());
		}
		for(int i=1;i<m;i++){
			int[] next=new int[p+1];
			Arrays.fill(next,Integer.MAX_VALUE);
			if(a[i]>a[i-1] && dp[0]!=Integer.MAX_VALUE) next[0]=a[i];
			for(int j=1;j<=p;j++){
				if(a[i]>dp[j]) next[j]=a[i];
				if(dp[j-1]==Integer.MAX_VALUE) continue;
				Integer temp=set.higher(dp[j-1]);
				if(temp!=null){
					next[j]=Math.min(next[j],temp);
				}
			}
			dp=next;
		}
		for(int i=0;i<=p;i++){
			if(dp[i]!=Integer.MAX_VALUE) return i;
		}
		return -1;
    }

}

class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        Solution Obj = new Solution();
        System.out.println(Obj.minOperations(a, b));
    }
}
