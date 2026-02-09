import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s=obj.next();
        
        int i=0;
        StringBuilder sb=new StringBuilder();
        
        if(n%3==1){
            sb.append(s.substring(0,2)).append("-");
            sb.append(s.substring(2,4)).append("-");
            i=4;
        }
        else if(n%3==2){
            sb.append(s.substring(0,2)).append("-");
            i=2;
        }
        while(i<n){
            sb.append(s.substring(i,i+3));
            i+=3;
            if(i<n){
                sb.append("-");
            }
        }
        if(sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());
    }
}
