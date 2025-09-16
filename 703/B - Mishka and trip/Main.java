import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        long[] a=new long[n+1];
        boolean[] fl=new boolean[n+1];
        long sum=0,sumsq=0,capSum=0,capSqSum=0,res=0;
        
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            a[i]=Long.parseLong(st.nextToken());
            sum+=a[i];
        }
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            int x=Integer.parseInt(st.nextToken());
            fl[x]=true;
            capSum+=a[x];
            capSqSum+=a[x]*a[x];
        }
        res=(capSum*capSum-capSqSum)/2;
        res+=capSum*(sum-capSum);
        
        for(int i=1;i<=n;i++){
            int j=i==n?1:i+1;
            if(!fl[i] && !fl[j]){
                res+=a[i]*a[j];
            }
        }
        System.out.println(res);
    }
}
