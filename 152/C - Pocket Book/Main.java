import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        long mod=(long)1e9+7;
        
        char[][] a=new char[n][m];
        
        for(int i=0;i<n;i++){
            a[i]=br.readLine().toCharArray();
        }
        
        long res=1;
        for(int i=0;i<m;i++){
            Set<Character>set=new HashSet<>();
            for(int j=0;j<n;j++){
                set.add(a[j][i]);
            }
            res=(res*set.size())%mod;
        }
        System.out.println(res);
    }
}
