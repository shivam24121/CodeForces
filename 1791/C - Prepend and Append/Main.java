import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            obj.nextLine();
            String s=obj.nextLine();
            solve(s);
        }
    }
    public static void solve(String s){
        int left=0;
        int right=s.length()-1;
        while(left<=right &&s.charAt(left)!=s.charAt(right)){
            left++;
            right--;
        }
        System.out.println(right-left+1);
    }
}
