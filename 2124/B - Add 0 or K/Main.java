import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            long k=obj.nextLong();
            long x=k+1;
            
            for(int i=0;i<n;i++){
                long a=obj.nextLong();
                long temp=a%x;      // remainder which tell how far is a divisible by k+1
                long aa=a+temp*k;   // new value of a which is divisible by k+1
                
                System.out.print(aa);
                if(i<n-1)System.out.print(" ");
            }
            System.out.println();
        }
    }
}
