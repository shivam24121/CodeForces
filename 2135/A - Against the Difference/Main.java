import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    static int[] dp;
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n];
            Map<Integer,ArrayList<Integer>>map=new HashMap<>();
            
            dp=new int[n];
            Arrays.fill(dp,-1);
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                map.putIfAbsent(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i);
            }
            
            System.out.println(solve(0,map,arr));
        }
    }
    public static int solve(int idx,Map<Integer,ArrayList<Integer>>map,int[] arr){
        
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int res=0;
        
        res=Math.max(res,solve(idx+1,map,arr));
        
        int curr=arr[idx];
        ArrayList<Integer>list=map.get(curr);
        int currIdx=Collections.binarySearch(list,idx);
        int target=currIdx+curr-1;
        
        if(target<list.size()){
            int nextIdx=list.get(target);
            res=Math.max(res,curr+solve(nextIdx+1,map,arr));
        }
        return dp[idx]=res;
    }
}
