https://course.acciojob.com/idle?question=d8b0a8ae-b9f4-4647-9d7b-eb783e5e5781



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.minimumEffortPath(grid));
    }
}

class Solution {
    public int minimumEffortPath(int[][] heights) {
    int l=0;
		int r=1000001;
		while(l<r){
			 int mid=(l+r)/2;
			if(isGood(heights,mid)){
				r=mid;
			}
			else{
				l=mid+1;
			}
		}
		return l;
	}
	private boolean isGood(int[][] h,int mid){
		int R=h.length;
		int c=h[0].length;
		Queue<int[]> q=new LinkedList();
		q.add(new int[]{0,0});
		boolean[][] vis=new boolean[R][c];
		int[][] dir=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
		while(q.size()>0){
			int x=q.peek()[0];
			int y=q.peek()[1];
			q.poll();
			if(x==R-1 && y==c-1)
				return true;
			for(int[] d:dir){
				int nx=x+d[0];
				int ny=y+d[1];
				if(nx>=0 && ny>=0 && nx<R && ny<c &&!vis[nx][ny]){
					if(Math.abs(h[x][y]-h[nx][ny])<=mid){
					q.add(new int[]{nx,ny});
					vis[nx][ny]=true;
				}
			}
		}
		}
		
	return false;
}
	}
	













