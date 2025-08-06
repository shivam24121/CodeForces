import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
            int sum=a+b+c;
            int x=n/sum;
            int y=n%sum;
            int ct=0;
            if(y>0){
                ct++;
                if(y>a){
                    ct++;
                    if(y>a+b){
                        ct++;
                    }
                }
            }
            System.out.println((x*3)+ct);
        }
    }
}
