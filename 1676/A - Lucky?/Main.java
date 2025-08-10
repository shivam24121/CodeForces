import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            System.out.println(solve(obj)?"YES":"NO");
        }
    }
    public static boolean solve(Scanner obj){
        String s=obj.next();
        int a=s.charAt(0)-'0'+s.charAt(1)-'0'+s.charAt(2)-'0';
        int b=s.charAt(3)-'0'+s.charAt(4)-'0'+s.charAt(5)-'0';
        return a==b;
    }
}
