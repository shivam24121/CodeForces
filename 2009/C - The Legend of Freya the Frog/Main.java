import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());
            System.out.println(solve(x,y,z));
        }
    }
    public static int solve(int x,int y,int z){
        int xMove=(x+z-1)/z;
        int yMove=(y+z-1)/z;
        return xMove>yMove?xMove*2-1:yMove*2;
    }
}
