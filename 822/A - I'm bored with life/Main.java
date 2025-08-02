import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println(fact(Math.min(a,b)));
        
    }
    static int fact(int n){
        if(n<=1)return 1;
        return n *fact(n-1);
    }
}
