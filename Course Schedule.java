https://course.acciojob.com/idle?question=98332447-d28d-42ee-9843-3d4d9d5ea20d










import java.util.*;

class Solution {
 
    @SuppressWarnings("unchecked")
    
    public int canFinish(int n, int[][] prerequisites) {
        //write your code here
		ArrayList<Integer>[] adj=new ArrayList[n];
		for(int i=0;i<n;i++)
			adj[i]=new ArrayList<Integer>();
		int[] indegree=new int[n];
		ArrayList<Integer> ans=new ArrayList<>();
		for(int[] x:prerequisites){
			adj[x[1]].add(x[0]);
			indegree[x[0]]++;
		}
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<n;i++){
			if(indegree[i]==0)
			q.offer(i);
		}
		int count=0;
		while(!q.isEmpty()){
			int curr=q.poll();
			count++;
			for(int child:adj[curr]){
				indegree[child]--;
				if(indegree[child]==0)
					q.offer(child);
			}
		}
		if(count==n)
			return 1;
				return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for(int i=0; i<M; i++){
            for(int j=0; j<2; j++)
                prerequisites[i][j]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.canFinish(N,prerequisites));

    }
}
