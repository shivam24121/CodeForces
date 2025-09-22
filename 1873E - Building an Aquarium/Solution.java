import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            int[] a=new int[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(n,x,a));
        }
    }
    public static int solve(int n,int x,int[] a){
        int l=0;
        int min=Arrays.stream(a).min().getAsInt();
        int r=min+x,res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(helper(a,x,mid)){
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
    public static boolean helper(int[] a,int x,int mid){
        return Arrays.stream(a).map(i->Math.max(0,mid-i)).asLongStream().sum()<=x;
    }
}
