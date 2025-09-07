/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-09-07
   Time: 20
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
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            int[] b=solve(n,a);
            display(b);
        }
    }
    public static int[] solve(int n,int[] a){
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=n+1-a[i];
        }
        return b;
    }
    public static void display(int[] b){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
