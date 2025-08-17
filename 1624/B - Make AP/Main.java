import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
            System.out.println(solve(a,b,c)?"yes":"no");
        }
    }
    //Case 1 adjust a: (ta,b,c) is AP - 2b=ta+c - ta=2b-c with  Z>0  - 2b-c≥1 and a|(2b-c)
    //Case 2 adjust b: (a,tb,c) is AP - 2tb=a+c - t=(a+c)/(2b)  Z>0  - 2b|(a+c)
    //Case 3 adjust c: (a,b,tc) is AP - 2b=a+tc - tc=2b-a with  Z>0  - 2b-a≥1 and c|(2b-a)
    
    public static boolean solve(int a,int b,int c){
        return (b*2-c>=1 && (b*2-c)%a==0) 
        || ((a+c)%(2*b)==0)
        || ((b*2-a)>=1 && (b*2-a)%c==0);
    }
}
