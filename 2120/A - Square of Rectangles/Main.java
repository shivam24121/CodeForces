import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int l1=obj.nextInt();
            int b1=obj.nextInt();
            int l2=obj.nextInt();
            int b2=obj.nextInt();
            int l3=obj.nextInt();
            int b3=obj.nextInt();
            boolean fl=false;
            if(l1==l2 && l1==l3 && l1==b1+b2+b3 
            || b1==b2 && b1==b3 && b1==l1+l2+l3)fl=true;
            if(l1+l2==l1+l3 &&l1+l3==b1 && b1==b2+b3 
            || b1+b2==b1+b3 && b1+b3==l1 && l1==l2+l3)fl=true;
            System.out.println(fl?"YES":"NO");
        }
    }
}
