import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        solve(s);
    }
    public static void solve(String s){
        int n=s.length();
        int max=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                max++;
                if(max==7){
                    System.out.println("YES");
                    return;
                }
            }
            else{
                max=1;
            }
        }
        System.out.println("NO");
    }
    
}
