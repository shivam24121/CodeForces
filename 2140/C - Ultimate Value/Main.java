/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-09-09
   Time: 21
*/

/*
   ███████╗██╗  ██╗██╗██╗   ██╗ █████╗ ███╗   ███╗
   ██╔════╝██║  ██║██║██║   ██║██╔══██╗████╗ ████║
   ███████╗███████║██║██║   ██║███████║██╔████╔██║
   ╚════██║██╔══██║██║╚██╗ ██╔╝██╔══██║██║╚██╔╝██║
   ███████║██║  ██║██║ ╚████╔╝ ██║  ██║██║ ╚═╝ ██║
   ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝  ╚═╝  ╚═╝╚═╝     ╚═╝
                      S H I V A M
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{

    static int gcd(int a, int b){ return b == 0 ? a : gcd(b, a % b); }
    static long lcm(long a, long b){ return (a / gcd((int)a, (int)b)) * b; }
    static boolean isPrime(int n){ if(n < 2) return false; if(n % 2 == 0) return n == 2; for(int i=3; i*i<=n; i+=2){ if(n % i == 0) return false; } return true; }
    static long fastPow(long a, long b, long mod){ long res = 1; a %= mod; while(b > 0){ if((b & 1) == 1) res = (res * a) % mod; a = (a * a) % mod; b >>= 1; } return res; }
    static int[] sieve(int n){ boolean[] isPrime = new boolean[n+1]; Arrays.fill(isPrime, true); isPrime[0] = isPrime[1] = false; for(int i=2; i*i<=n; i++){ if(isPrime[i]){ for(int j=i*i; j<=n; j+=i){ isPrime[j]=false; }}} List<Integer> primes=new ArrayList<>(); for(int i=2;i<=n;i++) if(isPrime[i]) primes.add(i); return primes.stream().mapToInt(Integer::intValue).toArray(); }
    static long nCr(int n, int r){ if(r > n) return 0; long res = 1; for(int i=0; i<r; i++){ res = res * (n - i) / (i + 1); } return res; }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n= Integer.parseInt(br.readLine());
            
            long[] a=new long[n]; 
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            System.out.println(solve(n,a));
         
        }
    }
    public static long solve(int n,long[]a){
        if(n==1){
            
            return a[0];
        }
        long sum=IntStream.range(0,n)
        .mapToLong(i->(i%2==0?a[i]:-a[i]))
        .sum();
        
        long oMin=Long.MAX_VALUE;
        long oMax=Long.MIN_VALUE;
        long eMin=Long.MAX_VALUE;
        long eMax=Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                oMin=Math.min(oMin,a[i]*2+i);
                oMax=Math.max(oMax,i-a[i]*2);
            }
            else{
                eMin=Math.min(eMin,i-a[i]*2);
                eMax=Math.max(eMax,2*a[i]+i);
            }
        }
        
        long res=n%2==1?n-1:n-2;
        res=Math.max(res,eMax-oMin);
        res=Math.max(res,oMax-eMin);
        
        return sum+res;  
        //System.out.println(res);
    } 
}
