import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        
        if(a.equals("0") && !b.equals("0")){
            System.out.println("WRONG_ANSWER");
            return;
        }
        
        int[] freq=new int[10];
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<a.length();i++){
            int x=a.charAt(i)-'0';
            freq[x]++;
        }
        
        for(int i=1;i<=9;i++){
            if(freq[i]>0){
                sb.append(i);
                freq[i]--;
                break;
            }
        }
        for(int i=0;i<=9;i++){
            while(freq[i]>0){
                sb.append(i);
                freq[i]--;
            }
        }
        System.out.println(sb.toString().equals(b)?"OK":"WRONG_ANSWER");
    }
}
