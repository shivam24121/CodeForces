import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println(Math.max(a,b));
    }
}
