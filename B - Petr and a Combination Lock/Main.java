import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        boolean fl=false;
        for(int mask=0;mask<(1<<n);mask++){
            int sum=0;
            for(int i=0;i<n;i++){
                if(((mask>>i)&1)!=0){
                    sum+=arr[i];
                }
                else{
                    sum-=arr[i];
                }
            }
            if(sum%360==0){
                fl=true;
                break;
            }
            if(fl)break;
        }
        System.out.println(fl?"YES":"NO");
    }
}
