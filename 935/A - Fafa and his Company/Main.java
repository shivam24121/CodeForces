import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(solve(n));
    }
    
    // O(root n) trick to find divisors 
     //eg 12 then divisors are 1,2,3,4,6,12
     // ignore 12 bcoz 12==n;
     // ignore one 6 becoz 6+6 =12 so to avoid counting two times the same divisors
     
    public static int solve(int n){
        int ct=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int d1=i;
                int d2=n/i;
                if(d1<n)ct++;
                if(d2<n && d1!=d2)ct++;
            }
        }
        return ct;
    }
}
