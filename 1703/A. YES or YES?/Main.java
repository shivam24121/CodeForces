/*
   Author: Shivam Kumar (shivam24121)
   Competitive Programming Template
   Language: Java 21
   Date: 2025-08-27
   Time: 12:47
*/

import java.io.*;
import java.util.*;

public class Main {

    static int gcd(int a, int b){ return b == 0 ? a : gcd(b, a % b); }
    static boolean isPrime(int n){ if(n < 2) return false; for(int i=2; i*i<=n; i++) if(n % i == 0) return false; return true; }
    static long lcm(long a, long b){ return (a / gcd((int)a, (int)b)) * b; }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine().toLowerCase();
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
