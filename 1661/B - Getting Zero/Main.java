import java.util.*;
import java.io.*;

public class PracticeCF {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        int t=Integer.parseInt(br.readLine());
        int t=1;
        while(t-->0){

            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());

            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int[] res=new int[n];
            int mod=32768;

            for(int i=0;i<n;i++){

                Set<Long>set=new HashSet<>();
                Queue<Long>q=new ArrayDeque<>();

                q.offer((long)arr[i]);
                set.add((long)arr[i]);

                int ct=0;

                while(!q.isEmpty()){

                    int size=q.size();

                    for(int x=0;x<size;x++){

                        long curr=q.poll();

                        if(curr==0){
                            res[i]=ct;
                        }
                        long one=(curr+1)%mod;

                        if(!set.contains(one)){
                            q.offer(one);
                            set.add(one);
                        }
                        long two=(curr*2)%mod;

                        if(!set.contains(two)){
                            q.offer(two);
                            set.add(two);
                        }
                    }
                    ct++;
                }
            }
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
