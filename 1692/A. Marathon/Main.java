import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
            int d=obj.nextInt();
            System.out.println(solve(a,b,c,d));
        }
    }
    static int solve(int a,int b,int c,int d){
        int ct=0;
        if (b >= a) ct++;
        if (c >= a) ct++;
        if (d >= a) ct++;
        return ct;
    }
}
