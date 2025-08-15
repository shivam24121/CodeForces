import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            solve(n,k);
        }
    }
    public static void solve(int n,int k){
        int res=(int)Math.ceil((n-2)/(double)k);
        System.out.println(res+1);
    }
}
