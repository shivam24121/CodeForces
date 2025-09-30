import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int i=1;
        int curr=0;
        ArrayList<Integer>res=new ArrayList<>();
        while(curr+i<=n){
            res.add(i);
            curr+=i;
            i++;
        }
        if(curr<n){
            res.set(res.size()-1,res.get(res.size()-1)+(n-curr));
        }
        System.out.println(res.size());
        for(int x=0;x<res.size();x++){
            System.out.print(res.get(x)+" ");
        }
    }
}
