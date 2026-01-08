import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        int[] b=new int[m];
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            b[i]=Integer.parseInt(st.nextToken());
        }
        int[] res=new int[m];
        Arrays.sort(a);
        
        for(int i=0;i<m;i++){
            res[i]=bs(a,b[i]);
        }
        
        for(int i=0;i<m;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    public static int bs(int[] a,int val){
        int l=0,r=a.length-1;
        int res=0;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]<=val){
                res=mid+1;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    } 
}
