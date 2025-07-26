import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0) {
			int n=obj.nextInt();
			int j=obj.nextInt();
			int k=obj.nextInt();
			int[] st=new int[n];
			for(int i=0; i<st.length; i++) {
				st[i]=obj.nextInt();
			}
			int target=st[j-1];
			int max=Arrays.stream(st).max().getAsInt();
			if(target==max || k!=1){
			    System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
