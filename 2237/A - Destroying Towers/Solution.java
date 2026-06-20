import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;
            int prefMin = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                prefMin = Math.min(prefMin, x);
                sum += prefMin;
            }

            ans.append(sum).append('\n');
        }

        System.out.print(ans);
    }
}
