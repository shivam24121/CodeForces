import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int p=obj.nextInt();
        System.out.println(solve(n,m,p)?"yes":"no");
    }
    public static boolean solve(int a,int b,int c){
        return a<=Math.min(b,c);
    }
}
