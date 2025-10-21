import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer>res=new ArrayList<>();
        
        while(n>1){
            res.add(n);
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    n/=i;
                    break;
                }
            }
        }
        res.add(1);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
}
