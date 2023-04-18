import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	  public static void main (String[] args) throws IOException {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int [][] arr= new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        Solution obj= new Solution();
	        
	        System.out.println(obj.orangesRotting(arr));
		}
}
class Solution{        
	 public static int orangesRotting(int[][] grid) {
//your code
		 if(grid==null  || grid.length==0) return 0;
		 int m=grid.length;
		 int n=grid[0].length;
		 Queue<int[]> que=new LinkedList<>();
		 int count=0;
		 for(int i=0;i<m;i++){
			 for(int j=0;j<n;j++){
				 if(grid[i][j]==2){
					 que.add(new int[]{i,j});
				 }
				 else if(grid[i][j]==1){
					 count++;
				 }
			 }
			 
		 }
		 if(count==0) return 0;
		 int counts=0;
		 int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
		 while(!que.isEmpty()){
			 ++counts;
			 int size=que.size();
			 for(int i=0;i<size;i++){
				 int[] point=que.poll();
				 for(int dir[]:dirs){
					 int x=point[0]+dir[0];
					 int y=point[1]+dir[1];
					 if(x<0||y<0 || x>=m || y>=n||grid[x][y]==0|| grid[x][y]==2) continue;
				grid[x][y]=2;
					 que.add(new int[]{x,y});
					 count--;
				 }
			 }
		 }
		 return count==0 ? counts-1:-1;
		 
}
}










