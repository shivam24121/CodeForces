import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0) {
			int n=obj.nextInt();
			int[] nums=new int[n];
			for(int i=0; i<n; i++) {
				nums[i]=obj.nextInt();
			}
			StringBuilder sb=new StringBuilder();
			sb.append('L');
			int left=1;
			int right=n-1;
			int curr=nums[0];
			while(left<=right) {
				if(left==right) {
					sb.append('L');
					left++;
				}
				else {
					if(curr<nums[left] && curr<nums[right]) {
						if(nums[right]>nums[left]) {
							sb.append("RL");
							curr=nums[left];
						}
						else {
							sb.append("LR");
							curr=nums[right];
						}
					}
					else if(curr>nums[left] && curr>nums[right]) {
						if(nums[right]<nums[left]) {
							sb.append("RL");
							curr=nums[left];
						}
						else {
							sb.append("LR");
							curr=nums[right];
						}
					}
					else {
						sb.append("LR");
						curr=nums[right];
					}
					left++;
					right--;
				}
			}

			System.out.println(sb);
		}
	}
}
