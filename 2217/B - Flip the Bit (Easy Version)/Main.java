import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int special=Integer.parseInt(st.nextToken());
            
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n+1];
            int res=0;
            
            for(int i=1;i<=n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int pos=Integer.parseInt(br.readLine());
            
            int exp=arr[pos];
            
            int left=0;
            
            for(int i=1;i<pos;i++){
                if(((left+arr[i])%2)!=exp){
                    left++;
                }
            }
            int right=0;
            
            for(int i=n;i>pos;i--){
                if(((right+arr[i])%2)!=exp){
                    right++;
                }
            }
            int max=left+right-Math.min(left,right);
            if(max%2==1){
                max++;
            }
            System.out.println(max);
        }
    }
}
