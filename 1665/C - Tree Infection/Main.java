import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n+1];
            for(int i=1;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                a[x]++;
            }
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(a[i]>0){
                    list.add(a[i]);
                }
            }
            Collections.sort(list,Collections.reverseOrder());
            int l=1;
            int r=n;
            int ans=n;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(valid(mid,list)){
                    ans=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            System.out.println(ans+1);
        }
    }
    public static boolean valid(int mid,ArrayList<Integer>list){
        if(mid<list.size())return false;
        int ct=0;
        for(int i=0;i<list.size();i++){
            ct+=Math.max(0,list.get(i)+i-mid);
        }
        return ct<=mid-list.size();
    }
}
