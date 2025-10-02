import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            
            int[] a=new int[n];
            int[] b=new int[n];
            int[] c=new int[n];
            
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                c[i]=Integer.parseInt(st.nextToken());
            }
            
            int[] best3A=best3(a);
            int[] best3B=best3(b);
            int[] best3C=best3(c);
            
            long res=0;
            for(int x:best3A){
                if(x==-1)continue;
                for(int y:best3B){
                    if(y==-1 ||y==x)continue;
                    for(int z:best3C){
                        if(z==-1 ||z==y || z==x)continue;
                        long curr=a[x]+b[y]+c[z];
                        res=Math.max(res,curr);
                    }
                }
            }
            System.out.println(res);
        }
    }
    public static int[] best3(int[] nums){
        int a=-1,b=-1,c=-1;
        for(int i=0;i<nums.length;i++){
            if(a==-1 || nums[i]>nums[a]){
                c=b;
                b=a;
                a=i;
            }
            else if(b==-1 || nums[i]>nums[b]){
                c=b;
                b=i;
            }
            else if(c==-1 || nums[i]>nums[c]){
                c=i;
            }
        }
        return new int[]{a,b,c};
    }
}
