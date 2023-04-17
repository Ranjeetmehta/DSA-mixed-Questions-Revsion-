https://course.acciojob.com/idle?question=74a8eec8-e108-4a93-8907-fda51e1e97f2

import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();
        int m = sc.nextInt();
        int coins[] = new int[m];
        for(int i = 0;i<m;i++)
            coins[i] = sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.minCoins(coins, m, v));

    }
}    

class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
		int tab[]=new int[V+1];
		tab[0]=0;
		for(int i=1;i<=V;i++)
			tab[i]=Integer.MAX_VALUE;
		for(int i=1;i<=V;i++){
			for(int j=0;j<M;j++)
				if(coins[j]<=i){
					int sub=tab[i-coins[j]];
					if(sub!=Integer.MAX_VALUE && sub +1<tab[i])
						tab[i]=sub+1;
				}
		}
		if(tab[V]==Integer.MAX_VALUE)
			return-1;
		return tab[V];

	} 
}
