import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        System.out.println(solve(a,b,c,d)?"YES":"NO");
    }
    public static boolean solve(int a,int b,int c,int d){
        int total=a+b+c+d;
        if(total%2!=0){
            return false;
        }
        int half=total/2;
        
        if((a==half) || (b==half) || (c==half) || (d==half) ||
           (a+b==half) || (a+c==half) || (a+d==half) ||
           (b+c==half) || (b+d==half) || (c+d==half)){
            return true;
        }
        return false;
    }
}
