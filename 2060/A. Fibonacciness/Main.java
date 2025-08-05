import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int d=obj.nextInt();
            int e=obj.nextInt();
            int res=1;
            for(int c=-100;c<=100;c++){
                res=Math.max(res,(c==a+b?1:0)+(d==b+c?1:0)+(e==c+d?1:0));
            }
            System.out.println(res);
        }
    }
}
