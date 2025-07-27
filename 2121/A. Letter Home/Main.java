import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0) {
			int n=obj.nextInt();
			int s=obj.nextInt();
			int[] distance=new int[n];
			for(int i=0; i<n; i++) {
				distance[i]=obj.nextInt();
			}
			int left=Math.abs(s-distance[0])+distance[n-1]-distance[0];
			int right=Math.abs(s-distance[n-1])+distance[n-1]-distance[0];
			System.out.println(Math.min(left,right));
		}
	}
}
