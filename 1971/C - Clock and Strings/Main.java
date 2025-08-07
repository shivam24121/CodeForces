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
            int x1=Math.min(a,b);
            int x2=Math.max(a,b);
            int ct=0;
            if(c>x1 && c<x2)ct++;
            if(d>x1 && d<x2)ct++;
            if(ct==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
