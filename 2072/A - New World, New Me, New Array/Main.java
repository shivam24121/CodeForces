import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            int p=obj.nextInt();
            if(k>n*p || k<(-n*p)){
                System.out.println("-1");
                continue;
            }
            int res=(int)Math.ceil(Math.abs((double)k/p));
            System.out.println(res);
        }
    }
}
