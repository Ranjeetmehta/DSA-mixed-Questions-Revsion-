https://course.acciojob.com/idle?question=8fef544e-f7da-40af-9a03-b137205ba36f

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();

        Solution ob = new Solution();
        
        System.out.println(ob.solve(nums));
        
	}
}

class Solution {
    public int solve(int nums[])
    {
        // your code here
		Arrays.sort(nums);
		int n=nums.length;
		int max=0;
		Deque<Integer> deq=new ArrayDeque<>();
		for(int num:nums){
			while(deq.size()>0 && num-deq.peek()>=n){
				deq.poll();
			}
			if(deq.size()==0 || !deq.peekLast().equals(num)){
				deq.add(num);
			}
			max=Math.max(max,deq.size());
		}
		return n-max;
    }

}
