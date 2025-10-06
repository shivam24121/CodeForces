import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            int max=0;;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                max=Math.max(max,a[i]);
            }
            int res=0;
            for(int i=2;i<=2*max;i++){
                int ct=0;
                boolean[] check=new boolean[n];
                for(int j=0;j<n;j++){
                    if(check[j]==true)continue;
                    for(int k=j+1;k<n;k++){
                        if(check[k]==true)continue;
                        if(a[j]+a[k]==i){
                            ct++;
                            check[j]=true;
                            check[k]=true;
                            break;
                        }
                    }
                }
                res=Math.max(res,ct);
            }
            System.out.println(res);
        }
    }
}
