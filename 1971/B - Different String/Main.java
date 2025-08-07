import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            int n=s.length();
            Set<Character> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(s.charAt(i));
            }
            if(set.size()==1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(check(s));
            }
        }
    }
    public static String check(String s){
        char[] c=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(c[i]!=c[0]){
                char temp=c[i];
                c[i]=c[0];
                c[0]=temp;
                break;
            }
        }
        return new String(c);
    }
}
