import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        System.out.println(a+rev(b));
    }
    public static int rev(int n){
        int res=0;
        while(n>0){
            int digit=n%10;
            res=(res*10)+digit;
            n/=10;
        }
        return res;
    }
}
