import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        
        int ah=Integer.parseInt(a.substring(0,2));
        int am=Integer.parseInt(a.substring(3,5));
        int bh=Integer.parseInt(b.substring(0,2));
        int bm=Integer.parseInt(b.substring(3,5));
        
        int aa=ah*60+am;
        int bb=bh*60+bm;
        
        int res=aa-bb;
        if(res<0){
            res+=24*60;
        }
        
        int h=res/60;
        int m=res%60;
        System.out.printf("%02d:%02d",h,m);
    }
}
