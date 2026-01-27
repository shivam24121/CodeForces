import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            boolean[] fl=new boolean[n+1];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<n;i++){
                int sum=a[i];
                for(int j=i+1;j<n;j++){
                    sum+=a[j];
                    if(sum>n){
                        break;
                    }
                    fl[sum]=true;
                }
            }
            int ans=0;
            for(int i=0;i<n;i++){
                if(fl[a[i]]){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
