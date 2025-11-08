import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            int max=Integer.MIN_VALUE,idxMax=-1;
            int min=Integer.MAX_VALUE,idxMin=-1;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            
            List<int[]>list=solve(a,n);
            
            System.out.println(list.size());
            for(int[] e:list){
                System.out.println(e[0]+" "+e[1]);
            }
        }
    }
    public static List<int[]> solve(int[] a,int n){
        int idx=-1;
        List<int[]> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(a[i]>0){
                idx=i;
                break;
            }
        }
        if(idx!=-1){
            
            for(int i=0;i<10;i++){
                //a[idx]+=a[idx];
                list.add(new int[]{idx+1,idx+1});
            }
            
            for(int i=idx+1;i<n;i++){
                list.add(new int[]{i+1,i});
            }
            
            for(int i=idx-1;i>=0;i--){
                list.add(new int[]{i+1,i+2});
            }
            
            for(int i=1;i<n;i++){
                list.add(new int[]{i+1,i});
            }
        }
        else{
            for(int i=n-2;i>=0;i--){
                list.add(new int[]{i+1,i+2});
            }
        }
        return list;
    }
}
