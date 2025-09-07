/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-09-07
   Time: 21
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
            StringTokenizer st=new StringTokenizer(br.readLine());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
            System.out.println(solve(a,b));
        }
    }
    /* observation yeh hai ki if a is even and b is odd then kabhi nhi ho sakta
     */
    // additionally agar a=1 ya koi bhi odd hua toh b should be multiple of 4
    // for detail refer to 1 6   1  8   1 10  1  12 sample
    /*
     * agar dono odd hue toh a+b simple ***** 1+1 =2 special case so take a+b and a*b+1 max
     * agar dono even hue to keep dividing till be became 2 and mutiply the ct with a
     */

    public static long solve(long a,long b){
        boolean flA=(a&1)==0;
        boolean flB=(b&1)==0;
        long ans1=0,ans2=0;

        if(flA!=flB){
            if(flA){
                //case 1;
                return -1;
            }
            else{
                //b is even and a is odd **** 4 wali condition/
                if(b%4!=0){
                    return -1;
                }
                else{
                    ans1=2*a+b/2;
                    ans2=a*(b/2)+2;
                }
            }
        }
        else{
            //both odd
            if(!flA){
                ans1=a+b;
                //specual case 1 1 
                ans2=(a*b+1);
            }
            else{
                //both even
                ans1=a+b;
                ans2=a*(b/2)+2;
            }
        }
        return Math.max(ans1,ans2);
    }
}
