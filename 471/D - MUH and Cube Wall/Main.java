import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            
            st=new StringTokenizer(br.readLine());
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            
            st=new StringTokenizer(br.readLine());
            
            int[] b=new int[m];
            
            for(int i=0;i<m;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            if(m==1){
                System.out.println(n);
                return;
            }
            
            int[] diffA=new int[n-1];
            int[] diffB=new int[m-1];
            
            int len=m-1;
            
            for(int i=1;i<n;i++){
                diffA[i-1]=arr[i]-arr[i-1];
            }
            for(int i=1;i<m;i++){
                diffB[i-1]=b[i]-b[i-1];
            }
            
            int[] lps=kmp(diffB);
            
            int ans=0;
            
            int i=0;
            int j=0;
            
            while(i<diffA.length){
                if(diffA[i]==diffB[j]){
                    i++;
                    j++;
                }
                if(j==len){
                    ans++;
                    j=lps[j-1];
                }
                else if(i<diffA.length && diffA[i]!=diffB[j]){
                    if(j!=0){
                        j=lps[j-1];
                    }
                    else{
                        i++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public static int[] kmp(int[] a){
        
        int n=a.length;
        int[] lps=new int[n];
        int i=1;
        int len=0;
        
        while(i<n){
            if(a[i]==a[len]){
                len++;
                lps[i]=len;
                i++;
            }
            else if(a[i]!=a[len] && len!=0){
                len=lps[len-1];
            }
            else{
                i++;
            }
        }
        return lps;
    }
}
