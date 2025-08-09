import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        int ct=0;
        if(match(a,c)+match(b,d)>0)ct++;
        if(match(a,d)+match(b,c)>0)ct++;
        if(match(b,c)+match(a,d)>0)ct++;
        if(match(b,d)+match(a,c)>0)ct++;
        System.out.println(ct);
        
    }
    public static int match(int x,int y){
        if(x>y)return 1;
        if(x<y)return -1;
        return 0;
    }
}
