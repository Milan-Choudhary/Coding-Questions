class Solution {
    public int minScore(int n, int[][] roads) {
        
        int ans = Integer.MAX_VALUE;
        
        Queue<Pair> q = new LinkedList<>();

        ArrayList<ArrayList<Pair>> list = new ArrayList<>();

        for(int i = 0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] arr : roads){
            int a = arr[0];
            int b = arr[1];
            int dist = arr[2];

            list.get(a).add(new Pair(b,dist));
            list.get(b).add(new Pair(a,dist));

        }

        q.add(new Pair(1,0));

        boolean[] vis = new boolean[n+1];


        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.b;
            int dist = p.dist;

            vis[node] = true;

            for(Pair ele : list.get(node)){
                ans = Math.min(ele.dist,ans);

                if(vis[ele.b] != true){
                    q.add(new Pair(ele.b,ele.dist));
                }

                
            }


        }      

        return ans;

    }

    public static class Pair{
        int a;
        int b;
        int dist;

        Pair(int b,int dist){
            this.b = b;
            this.dist = dist;
        }

    }


}