import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));;
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        solve(a,n);
    }
    public static void solve(int[] a,int n){
        int l=0,r=n-1;
        int alice=0,bob=0;
        int aTime=0,bTime=0;
        
        while(l<r){
            aTime+=a[l];
            alice++;
            bTime+=a[r];
            bob++;
            l++;
            r--;
        }
        if(a[l]==a[r]){
            if(aTime<=bTime){
                alice++;
            }
            else{
                bob++;
            }
        }
        System.out.println(alice+" "+bob);
    }
}
