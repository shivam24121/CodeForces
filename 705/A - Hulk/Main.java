import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sb.append("I hate");
            }
            else{
                sb.append("I love");
            }
            if(i==n){
                sb.append(" it");
            }
            else{
                sb.append(" that ");
            }
        }
        System.out.println(sb.toString());
    }
}
