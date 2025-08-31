/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-08-31
   Time: 10
*/

import java.io.*;
import java.util.*;

public class Main {

    static int gcd(int a, int b){ return b == 0 ? a : gcd(b, a % b); }
    static boolean isPrime(int n){ if(n < 2) return false; for(int i=2; i*i<=n; i++) if(n % i == 0) return false; return true; }
    static long lcm(long a, long b){ return (a / gcd((int)a, (int)b)) * b; }

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long sum=0;
            for(int i=0;i<n;i++){
                long x=Long.parseLong(st.nextToken());
                sum+=x;
            }
            System.out.println(check(sum)?"YES":"NO");
        }
    }
    private static boolean check(long num){
        if(num==0)return true;
        long low=1,high=(long)1e9;
        while(low<=high){
            long mid=low+(high-low)/2;
            long sq=mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
