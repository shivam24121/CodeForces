import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String p=obj.nextLine();
            String s=obj.nextLine();
            System.out.println(solve(p,s)?"YES":"NO");
        }
    }
    public static boolean solve(String p,String s){
        if(s.length() <p.length() || p.charAt(0)!=s.charAt(0)){
            return false;
        }
        int i=0,j=0;
        while(i<p.length() && j<s.length()){
            char cp=p.charAt(i);
            char cs=s.charAt(j);
            if(cp!=cs){
                return false;
            }
            int ct1=0;
            while(i<p.length() && p.charAt(i)==cp){
                ct1++;
                i++;
            }
            int ct2=0;
            while(j<s.length() && s.charAt(j)==cs){
                ct2++;
                j++;
            }
            if(ct1>ct2 || ct2>2*ct1){
                return false;
            }
        }
        
        return i==p.length() && j==s.length();
    }
}

