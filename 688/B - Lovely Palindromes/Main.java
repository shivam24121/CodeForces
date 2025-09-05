import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        StringBuilder sb=new StringBuilder(s);
        String pallindrome=s+sb.reverse().toString();
        System.out.println(pallindrome);
    }
}
