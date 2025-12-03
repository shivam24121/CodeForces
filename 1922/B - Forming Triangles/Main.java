import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] freq=new int[n+1];
            int[] a=new int[n];
            
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                freq[a[i]]++;
            }
            long res=0;
            long cumF=0;
            for(int i=0;i<=n;i++){
                res+=1L*freq[i]*(freq[i]-1)*(freq[i]-2)/6;
                res+=1L*freq[i]*(freq[i]-1)/2*cumF;
                cumF+=freq[i];
            }
            System.out.println(res);
        }
    }
}
