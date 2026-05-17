import java.util.*;
import java.io.*;

public class Main{

    static int lowerBound(int[] a,int l,int r,int x){

        while(l<r){

            int m=l+(r-l)/2;

            if(a[m]>=x){
                r=m;
            }
            else{
                l=m+1;
            }
        }

        return l;
    }

    static int upperBound(int[] a,int l,int r,int x){

        while(l<r){

            int m=l+(r-l)/2;

            if(a[m]>x){
                r=m;
            }
            else{
                l=m+1;
            }
        }

        return l;
    }

    public static void main(String[] args)throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        StringBuilder sb=new StringBuilder();

        while(t-->0){

            int n=Integer.parseInt(br.readLine());

            int[] a=new int[n];

            StringTokenizer st=new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }

            long ans=0;

            int mx=a[n-1];

            for(int i=0;i<n;i++){

                for(int j=i+1;j<n;j++){

                    int sum=a[i]+a[j];

                    int l=upperBound(a,j+1,n,mx-sum);

                    int r=lowerBound(a,j+1,n,sum);

                    ans+=Math.max(0,r-l);
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
