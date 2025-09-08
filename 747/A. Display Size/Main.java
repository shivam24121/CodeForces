import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a=1,b=n;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                if(j-i<b-a){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println(a+" "+b);
    }
}
