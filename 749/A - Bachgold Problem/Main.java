import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n==3){
            System.out.println(1);
            System.out.println(3);
            return;
        }
        if(n%2==1){
            int numTwo=(n-1)/2;
            System.out.println(numTwo);
            for(int i=0;i<numTwo-1;i++){
                System.out.print(2+" ");
            }
            System.out.println(3);
        }
        else{
            int numTwo=n/2;
            System.out.println(numTwo);
            for(int i=0;i<numTwo;i++){
                System.out.print(2+" ");
            }
            System.out.println();
        }
        
    }
}
