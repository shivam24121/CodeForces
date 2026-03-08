import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int max=0,sum=0;
            for(int i=0;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                sum+=x;
                max=Math.max(max,x);
            }
            if(max>(sum-max) || n%2==1){
                System.out.println("T");
            }
            else{
                System.out.println("HL");
            }
        }
    }
}
