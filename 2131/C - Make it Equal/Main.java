import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            long k=obj.nextLong();
            long[] a=new long[n];
            long[] b=new long[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i]=obj.nextLong();
            }
            solve(a,b,k);
        }
    }
    /* agar k==0 hua toh sort both array and check for each element if any value is 
    different then print no otherwise yes 
    yeh special case hogya 
    iske alawa we can just reduce all element of both array to nearest mutiple around k 
    eg a= 1,4,7
       b= 2,5,8
       k==3 
       
       then 1%3 =1 math.min(1,2)=1
       similarly                =1
                                =1
       aur second array me math.min(2,1) ayeaga coz remaider is 2 
       since all element after helper func is 1 so ans is true;*/
    
    public static void solve(long[] a,long[] b,long k){
        int n=b.length;
        if(k==0){
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            return;
        }
        long[] aa=new long[n];
        long[] bb=new long[n];
        for(int i=0;i<n;i++){
            aa[i]=helper(a[i],k);
        }
        for(int i=0;i<n;i++){
            bb[i]=helper(b[i],k);
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        for(int i=0;i<n;i++){
            if(aa[i]!=bb[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static long helper(long a,long b){
        long x=a%b;
        if(x<0){
            x+=b;
        }
        return Math.min(x,b-x); 
    }
}
