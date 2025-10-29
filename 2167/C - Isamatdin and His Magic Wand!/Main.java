 public static void solve(int n,int[] a){
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        boolean o=false,e=false;
        
        for(int i:a){
            if(i%2==0){
                even.add(i);
                e=true;
            }
            else{
                odd.add(i);
                o=true;
            }
        }
        if(!e || !o){
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        else{
            Collections.sort(even);
            Collections.sort(odd);
            
            int i=0;
            int j=0;
            
            while(i<even.size() && j<odd.size()){
                if(even.get(i)<odd.get(j)){
                    System.out.print(even.get(i)+" ");
                    i++;
                }
                else{
                    System.out.print(odd.get(j)+" ");
                    j++;
                }
            }
            while(j<odd.size()){
                System.out.print(odd.get(j)+" ");
                j++;
            }
            while(i<even.size()){
                System.out.print(even.get(i)+" ");
                i++;
            }
            System.out.println();
        }
        
    }
}
