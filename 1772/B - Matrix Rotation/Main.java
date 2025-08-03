import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int tl=obj.nextInt();
            int tr=obj.nextInt();
            int bl=obj.nextInt();
            int br=obj.nextInt();
            System.out.println(solve(tl,tr,bl,br)?"YES":"NO");
        }
        obj.close();
    }
    private static boolean solve(int a,int b,int c,int d){
        return check(a,b,c,d,3);
    }
    static boolean check(int a,int b, int c, int d,int rotate){
        return(a<b && a<c && b<d && c<d || rotate!=0 && check(b,d,a,c,rotate-1));
    }
}
