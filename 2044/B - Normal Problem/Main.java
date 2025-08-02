import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='q')sb.append('p');
                else if(s.charAt(i)=='p')sb.append('q');
                else sb.append('w');
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
