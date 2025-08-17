import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            obj.nextLine();
            String s=obj.next();
            System.out.println(solve(n,k,s));
        }
    }
    public static int solve(int n,int k,String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int ct=0;
        for(int i=0;i<n;i++){
            if(sb.charAt(i)=='B'){
                ct++;
                sb.replace(i,i+k,"W".repeat(k));
            }
        }
        return ct;
    }
}
