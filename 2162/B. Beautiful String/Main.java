    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            /*StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            */
            String s=br.readLine();
            solve(n,s);
        }
    } 
    public static void solve(int n,String s){
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='1'){
                res.add(i+1);
            }
        }
        System.out.println(res.size());
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
}
