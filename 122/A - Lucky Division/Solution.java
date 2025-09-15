import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(lucky(n)){
            System.out.println("YES");
            return;
        }
        for(int i=1;i<=n;i++){
            if(lucky(i)){
                if(n%i==0){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
        
    }
    public static boolean lucky(int temp){
        while(temp>0){
            int a=temp%10;
            if(a!=4 && a!=7){
                return false;
            }
            temp/=10;
        }
        return true;
    }
    
}
