import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int k=obj.nextInt();
        int n=obj.nextInt();
        int w=obj.nextInt();
        solve(k,n,w);
    }
    public static void solve(int k,int n,int w){
        int sum=k*(w*(w+1)/2);
        int borrow=sum-n;
        if(borrow<=0){
            System.out.println(0);
        }
        else{
            System.out.println(borrow);
        }
    }
}
