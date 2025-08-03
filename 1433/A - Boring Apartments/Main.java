import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            String s=obj.next();
            int c=s.charAt(0)-'0';
            int d=s.length();
            int res=10*(c-1)+(d*(d+1))/2;
            System.out.println(res);
        }
    }

}
