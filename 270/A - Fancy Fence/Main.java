import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int diff=180-n;
            if(diff<=0){
                System.out.println("NO");
            }
            else if(360%diff==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
/*(n-2)*180/n=angle;
  (180n -360)n;
  180-360/n;
  360/n=angle;
  
  =>>180-a 
  */
