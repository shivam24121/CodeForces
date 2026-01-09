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
        
        long time=a[0];
        int ans=1;
        
        for(int i=1;i<n;i++){
            if(time<=a[i]){
                ans++;
                time+=a[i];
            }
        }
        System.out.println(ans);
    }
}
