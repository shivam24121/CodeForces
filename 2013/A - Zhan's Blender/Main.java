import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int x=obj.nextInt();
            int y=obj.nextInt();
            System.out.println(solve(n,x,y));
        }
    }
    public static int solve(int n,int x,int y){
        int res=n/Math.min(x,y);
        int rem=Math.min(x,y);
        if (n%rem!=0){
            res++;
        }
        return res;
    }
}
