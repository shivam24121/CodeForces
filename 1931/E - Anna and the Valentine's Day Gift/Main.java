import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String[] a=new String[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=st.nextToken();
            }
            int[] length=new int[n];
            int[] zero=new int[n];

            for(int i=0;i<n;i++){
                int idx=a[i].length();
                length[i]=idx;

                int ct=0;
                for(int j=a[i].length()-1;j>=0 && a[i].charAt(j)=='0';j--){
                    ct++;

                }
                zero[i]=ct;
            }
            int res=0;
            for(int i=0;i<n;i++){
                res+=length[i]-zero[i];
            }
            Arrays.sort(zero);
            for(int i=0;i<n/2;i++){
                int temp=zero[i];
                zero[i]=zero[n-i-1];
                zero[n-i-1]=temp;
            }
            for(int i=1;i<n;i+=2){
                res+=zero[i];
            }
            System.out.println(res-1>=m?"Sasha":"Anna");
        }
    }
}
        
