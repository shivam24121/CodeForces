import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            long n=obj.nextLong();
            long k=obj.nextLong();
            long x=obj.nextLong();
            System.out.println(solve(n,k,x)?"YES":"NO");
        }
    }
    
    // ya toh sum chota ho x ke first k elements ka ya last k ka sum bigger ho x se
    // small= k*(k+1l)/2;
    // large=n/2(first+last)
    // so k/2(n-k+1+(n));
    // n*(2n-k+1)/2;
    
    public static boolean solve(long n,long k,long x){
        return x>=k*(k+1L)/2 && x<=k*(2*n-k+1)/2;
    }
}
