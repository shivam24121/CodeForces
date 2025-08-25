import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            
            if(Math.min(a,b)>Math.max(c,d) || Math.max(a,b)<Math.min(c,d)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
