import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int intial=Integer.parseInt(st.nextToken());
            int[] a=new int[n+1];
            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(n,intial,a)?"YES":"NO");
        }
    }
    public static boolean solve(int n,int intial,int[] a){
        int curr=a[intial];
        int jump=a[intial];
        
        Arrays.sort(a,1,n+1);
        boolean fl=true;
        for(int i=1;i<=n;i++){
            if(a[i]<curr)continue;
            if(a[i]-curr>jump){
                return false;
            }
            curr=a[i];
        }
        return true;
    }
}
