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
            int x=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            
            int odd=0,even=0;
            
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            
            for(int i:arr){
                if(i%2==1){
                    odd++;
                }
                else{
                    even++;
                }
            }
            if(odd==0){
                System.out.println("No");
            }
            else if(odd%2==0 && n==x){
                System.out.println("No");
            }
            else if(odd%2==0 && n==odd){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
