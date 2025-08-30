    /*
       Author: Shivam Kumar (shivam24121)
       Language: Java 21
       Date: 2025-08-30
       Time: 21
    */
    
    import java.io.*;
    import java.util.*;
    
    public class B {
    
        static int gcd(int a, int b){ return b == 0 ? a : gcd(b, a % b); }
        static boolean isPrime(int n){ if(n < 2) return false; for(int i=2; i*i<=n; i++) if(n % i == 0) return false; return true; }
        static long lcm(long a, long b){ return (a / gcd((int)a, (int)b)) * b; }
    
        public static void main(String[] args) throws Exception {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while(t-->0) {
                int n=Integer.parseInt(br.readLine());
                String s=br.readLine();
                char[] a=new char[n];
                for(int i=0;i<n;i++){
                    a[i]=s.charAt(i);
                }
                int ct=1;
                int res=1;
                for(int i=1;i<n;i++){
                    if(a[i]!=a[i-1]){
                        ct=1;
                    }
                    else{
                        ct++;
                    }
                    res=Math.max(res,ct);
                }
                System.out.println(res+1);
        }
    }
	
}
