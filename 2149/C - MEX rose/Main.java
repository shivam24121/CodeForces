/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-09-25
   Time: 20:xx
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
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int[] a=new int[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            System.out.println(solve(n,m,a));
        }
    } 
    public static int solve(int n,int m,int[] a){
        int[] temp=new int[n+1];
        for(int i:a){
            temp[i]++;
        }
        int res=0;
        for(int i=0;i<m;i++){
            if(temp[i]==0){
                res++;
            }
        }
        int res2=temp[m];
        return Math.max(res,res2);
    }
}
