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
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n];
            
            int one=0;
            boolean fl=false;
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                if(arr[i]==1){
                    one++;
                }
                if(arr[i]>1){
                    fl=true;
                }
            }
            int move=one+(fl?1:0);
            
            System.out.println(move%2==1?"Alice":"Bob");
        }
    }
}
