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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            
            StringTokenizer st=new StringTokenizer(br.readLine());
            
            Map<Integer,List<Integer>> map=new HashMap<>();
            //Set<Integer> set=new HashSet<>();
            
            int[] b=new int[n];
            
            for(int i=0;i<n;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            
            for(int i=0;i<n;i++){
                map.computeIfAbsent(b[i],x->new ArrayList<>()).add(i);
            }
            
            boolean fl=true;
            List<Integer> temp=new ArrayList<>(map.keySet());
            for(int k:temp){
                if(map.get(k).size()%k!=0){
                    fl=false;
                    break;
                }
            }
            
            if(!fl){
                System.out.println(-1);
                continue;
            }
            
            int[] a=new int[n];
            int idx=1;
            
            for(int k:temp){
                List<Integer>l=map.get(k);
                for(int i=0;i<l.size();i+=k){
                    for(int j=0;j<k;j++){
                        a[l.get(i+j)]=idx;
                    }
                    idx++;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
