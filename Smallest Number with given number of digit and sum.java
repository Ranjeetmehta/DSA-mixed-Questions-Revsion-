https://course.acciojob.com/idle?question=9af07aa6-8553-4c43-bd37-83bff306832a





import java.util.*;
class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int k=sc.nextInt();
				Solution ob =new Solution();
				String ans = ob.smallestNumber(n,k);
				System.out.println(ans);
				t--;
			}
		}
	}

}

class Solution{ 
    public String smallestNumber(int S, int D){
        //Write code here
		if(S>9*D)
			return "-1";
		String ans="";
		S-=1;
		for(int i=0;i<D-1;i++){
			if(S>9){
				S-=9;
				ans=9+ans;
			}
			else{
				ans=S+ans;
				S=0;
			}
		}
		ans=(S+1)+ans;
		return ans;
    }
}













