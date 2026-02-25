import java.util.*;
import java.io.*;
public class Main{
    static int max=100002;
    static ArrayList<Integer>[]div=new ArrayList[max];
    static void pre(){
        for(int i=1;i<max;i++){
            div[i]=new ArrayList<>();
        }
        for(int i=1;i<max;i++){
            for(int x=i;x<max;x+=i){
                div[x].add(i);
            }
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        pre();
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            int[] a=new int[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            int[] freq=new int[k+1];
            int ct=0;
            int l=0;
            int res=Integer.MAX_VALUE;
            for(int r=0;r<n;r++){
                ArrayList<Integer>fact=div[a[r]];
                for(int x:fact){
                    if(x<=k){
                        freq[x]++;
                        if(freq[x]==1)ct++;
                    }
                }
                while(ct==k){
                    res=Math.min(res,a[r]-a[l]);
                    ArrayList<Integer>list=div[a[l]];
                    for(int j:list){
                        if(j<=k){
                            freq[j]--;
                            if(freq[j]==0)ct--;
                        }
                    }
                    l++;
                }
            }
            System.out.println(res==Integer.MAX_VALUE?"-1":res);
        }
    }
    public static ArrayList<Integer> factors(int n){
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                if(i!=(n/i)){
                    res.add(n/i);
                }
            }
        }
        return res;
    }
}
