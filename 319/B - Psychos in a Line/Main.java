import java.util.*;
import java.io.*;

public class Psychos{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack=new Stack<>();
        int[] dp=new int[n];
        int res=0;

        for(int i=0;i<n;i++) {
            int kill = 0;
            while (!stack.isEmpty() && a[i] >= a[stack.peek()]) {
                kill = Math.max(kill, dp[stack.pop()]);
            }
            //System.out.print(kill+" :-");
            if (stack.isEmpty()) {
                dp[i] = 0;
            } else {
                dp[i] = kill + 1;
            }

            res = Math.max(res, dp[i]);
            stack.push(i);
        }
//        for(int i=0;i<n;i++){
//            System.out.print(dp[i]+" ");
//        }
        System.out.println(res);
    }
}




 
