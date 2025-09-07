import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long yellowCrystal=Long.parseLong(st.nextToken());
        long blueCrystal=Long.parseLong(st.nextToken());
        
        st=new StringTokenizer(br.readLine());
        long yellow=Long.parseLong(st.nextToken());
        long green=Long.parseLong(st.nextToken());
        long blue=Long.parseLong(st.nextToken());
        
        long req=0;
        
        long reqYellow=(yellow*2)+green;
        long reqBlue=(blue*3)+green;
        
        if(reqYellow>yellowCrystal){
            req+=reqYellow-yellowCrystal;
        }
        if(reqBlue>blueCrystal){
            req+=reqBlue-blueCrystal;
        }
        System.out.println(req);
    }
}
