import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int high=Integer.highestOneBit(n-1);
            
            for(int i=high-1;i>=0;i--){
                System.out.print(i+" ");
            }
            for(int i=high;i<n;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
