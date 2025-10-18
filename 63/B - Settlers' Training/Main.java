import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int ct=0;
        while(true){
            Set<Integer>set=new HashSet<>();
            for(int i:a){
                if(i<k){
                    set.add(i);
                }
            }
            if(set.isEmpty()){
                break;
            }
            for(int i:set){
                for(int j=0;j<n;j++){
                    if(a[j]==i){
                        a[j]++;
                        break;
                    }
                }
            }
            ct++;
        }
        System.out.println(ct);
    }
}
