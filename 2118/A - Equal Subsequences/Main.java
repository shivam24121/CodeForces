import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            System.out.println(solve(n,k));
        }
    }
    public static String solve(int n,int k){
        return "1".repeat(k)+"0".repeat(n-k);
    }
}
