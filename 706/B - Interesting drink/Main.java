import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        
        int q=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(q-->0){
            int m=Integer.parseInt(br.readLine());
            int count=solve(a,m);
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
    public static int solve(int[] a,int m){
        int l=0,r=a.length-1,res=a.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]>m){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}
