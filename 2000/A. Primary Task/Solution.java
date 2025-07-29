import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            String s=String.valueOf(n);
            boolean res=false;
            if(s.length()>=3 && s.charAt(2)!='0' && s.startsWith("10") && Integer.parseInt(s.substring(2))>=2)res=true;
            System.out.println(res?"YES":"NO");
        }
    }
}
