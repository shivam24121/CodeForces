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
            
            int[] arr=new int[n];
            int[] temp=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                temp[i]=arr[i];
            }
            Arrays.sort(temp);
            
            boolean fl=true;
            
            for(int i=0;i<n;i++){
                if(i+x>n-1 && i-x<0 && arr[i]!=temp[i]){
                    fl=false;
                    break;
                }
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
