import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        char[] c=new char[k];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            c[i]=(char)(i+'a');
        }
        for(int i=0;i<n;i++){
            sb.append(c[i%k]);
        }
        System.out.println(sb.toString());
    }
}
