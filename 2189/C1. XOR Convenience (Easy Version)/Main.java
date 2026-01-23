public static void main(String[] args) throws IOException {
 
        int t=ekint();
        while(t-->0){
            int n=ekint();
 
            ArrayList<Integer>list=new ArrayList<>();
            list.add(n%2==1?n-1:n);
            for(int i=2;i<=n-1;i++){
                list.add(i^1);
            }
            list.add(1);
 
            for(int i=1;i<=n;i++){
                System.out.print(list.get(i-1)+" ");
            }
            System.out.println();
        }
