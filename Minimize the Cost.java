https://course.acciojob.com/idle?question=f6d441af-b555-4fcd-8b97-5c75f0fca3c9


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
	static int findMinimumCost(int[] arr, int N) {
		//Write your code here
		int ans=0;
		int[] copy=new int[N];
		boolean[] visited=new boolean[N];
	for(int i=0;i<N;i++){
		copy[i]=arr[i];
		visited[i]=false;
	}
		Arrays.sort(copy);
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<N;i++){
			map.put(copy[i],i);
		}
		for(int i=0;i<N;i++){
			if(visited[i]==false){
				if(map.get(arr[i])==i){
					visited[i]=true;
					continue;
				}
				int min=arr[i],cost1,cost2;
				int num=0;
				int sum=0;
				int j=i;
				while(visited[j]==false){
					sum+=arr[j];
					num++;
					
						if(arr[j]<min){
							min=arr[j];
						}
						visited[j]=true;
						j=map.get(arr[j]);
					}
					sum-=min;
				cost1=sum+min*(num-1);
					cost2=copy[0]*(num+1)+2*min+sum;
					if(cost1<cost2){
						ans+=cost1;
					}
					else{
						ans+=cost2;
					}
				}
			}
			return ans;
		}
	
}
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; ++i) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(Solution.findMinimumCost(arr, N));
		scanner.close();
	}
}
