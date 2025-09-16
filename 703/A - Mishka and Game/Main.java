import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int mishika=0,chris=0;
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a>b)mishika++;
            if(b>a)chris++;
        }
        System.out.println(mishika>chris?"Mishka":mishika==chris?"Friendship is magic!^^":"Chris");
    }
}
