import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
        obj.nextLine();
        String s=obj.nextLine();
        solve(s);
    }
    public static void solve(String s){
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')a++;
            else b++;
        }
        if(a==b){
            System.out.println("Friendship");
        }
        else if(a>b){
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
    }
}
