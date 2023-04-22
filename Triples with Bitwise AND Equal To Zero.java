https://course.acciojob.com/idle?question=86aaf8d4-7a31-4f05-b4cc-37d8d545460b

import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
	    n = in.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        nums[i]=in.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.solve(nums));
        
    }
    
}

class Solution{
    
    static int solve(int nums[])
    {
        // your code here
		int[] count=new int[1<<16];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				count[nums[i]&nums[j]]++;
			}
		}
		int ans=0;
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<1<<16;j++){
				if((nums[i]&j)==0)
					ans+=count[j];
			}
		}
		return ans;
        
    }
}











