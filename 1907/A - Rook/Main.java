import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            solve(s);
        }
    }
    public static void solve(String s){
        char c=s.charAt(0);
        int n=s.charAt(1)-'0';
        for(char i='a';i<'i';i++){
            if(i==c)continue;
            System.out.println(""+i+n);
        }
        for(int i=1;i<9;i++){
            if(i==n)continue;
            System.out.println(""+c+i);
        }
    }
}
