import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            int ct=0;
            if(s.charAt(0)=='a')ct++;
            if(s.charAt(1)=='b')ct++;
            if(s.charAt(2)=='c')ct++;
            System.out.println(ct>0?"YES":"NO");
        }
    }
}
