import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            int inv=9-c;
            if(i==0 && inv==0){
                sb.append(c);
            }
            else{
                sb.append(Math.min(inv,c));
            }
        }
        System.out.println(sb.toString());
    }
}
