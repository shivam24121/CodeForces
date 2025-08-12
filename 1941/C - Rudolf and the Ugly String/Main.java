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
        int n=s.length();
        int ct=0;
        boolean[] c=new boolean[n];
        for(int i=0;i<=n-5;i++){
            if(s.startsWith("mapie",i)){
                ct++;
                for(int j=i;j<i+5;j++){
                    c[j]=true;
                }
            }
        }
        for(int i=1;i<n-1;i++){
            if(!c[i] && s.charAt(i)=='a' && s.charAt(i-1)=='m' && s.charAt(i+1)=='p')ct++;
            if(!c[i] && s.charAt(i)=='i' && s.charAt(i-1)=='p' && s.charAt(i+1)=='e')ct++;
        }
        System.out.println(ct);
    }
}
