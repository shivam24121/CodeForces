import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            int[] used=new int[n+1];
            
            TreeSet<Integer>p=new TreeSet<>();
            TreeSet<Integer>q=new TreeSet<>();
            
            for(int i=1;i<=n;i++){
                p.add(i);
                q.add(i);
            }
            int[] ap=new int[n];
            int[] aq=new int[n];
            boolean fl=true;
            
            for(int i=0;i<n;i++){
                int curr=a[i];
                
                if(used[curr]==0){
                    ap[i]=curr;
                    used[curr]++;
                    p.remove(curr);
                }
                else if(used[curr]==1){
                    aq[i]=curr;
                    used[curr]++;
                    q.remove(curr);
                }
                else{
                    fl=false;
                }
            }
            if(!fl){
                System.out.println("NO");
                continue;
            }
            
            for(int i=0;i<n;i++){
                int curr=a[i];
                
                if(ap[i]==0){
                    Integer val=p.floor(curr);
                    if(val==null){
                        fl=false;
                        break;
                    }
                    ap[i]=val;
                    p.remove(val);
                }
                if(aq[i]==0){
                    Integer val=q.floor(curr);
                    if(val==null){
                        fl=false;
                        break;
                    }
                    aq[i]=val;
                    q.remove(val);
                }
            }
            if(!fl){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for(int i:ap){
                System.out.print(i+" ");
            }
            System.out.println();
            for(int i:aq){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
