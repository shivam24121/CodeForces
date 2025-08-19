import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            System.out.println(solve(a));
        }
    }
    /* if n is even then we can choose max + n/2
       if n is odd then 
           case1) max is at odd position then ans=max+n/2;
           case2) else we have to compromise one one red index to get max element so subtract 1 from ans
       */
    
    public static int solve(int[] a){
        int n=a.length;
        int max=Arrays.stream(a).max().getAsInt();
        int half=(n+1)/2;
        if((n&1)==0){
            return max+half;
        }
        boolean oddpos=false;
        for(int i=0;i<n;i+=2){
            if(a[i]==max){
                oddpos=true;
                break;
            }
        }
        if(oddpos){
            return max+half;
        }
        else{
            return max+half-1;
        }
    }
}
