import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
        String s=obj.nextLine().toLowerCase();
        solve(n,s);
    }
    public static void solve(int n ,String s){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        System.out.println((set.size()==26)?"YES":"NO");
    }
}
