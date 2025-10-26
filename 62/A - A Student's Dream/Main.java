import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
        st=new StringTokenizer(br.readLine());
        
        int c=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        
        if(solve(a,d) || solve(b,c)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean solve(int a,int b){
        return b>=Math.max(0,a-1) && 2*a+2>=b;
    }

}
