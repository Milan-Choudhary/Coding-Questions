class Solution {

    class Pair{
        int val;
        long time;

        Pair(int d,long t){
            val = d;
            time = t;
        }
    }

    public int countPaths(int n, int[][] roads) {
        int modulo = 1000_000_007;

        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
        long[] distance = new long[n];
        int[] ways = new int[n];

        Arrays.fill(distance,Long.MAX_VALUE);
        distance[0] = 0;
        ways[0] = 1;

        for(int i = 0; i<n; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i<roads.length; i++){
            int u = roads[i][0];
            int v = roads[i][1];
            long t = roads[i][2];

            list.get(u).add(new Pair(v,t));
            list.get(v).add(new Pair(u,t));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Long.compare(a.time,b.time));


        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int node = p.val;
            long t = p.time;

            if(t > distance[node]){
                continue;
            }

            for(Pair next : list.get(node)){

                int a = next.val;
                long b = next.time;

                if(t + b < distance[a]){
                    distance[a] = t + b;
                    ways[a] = ways[node];
                    pq.add(new Pair(a,distance[a]));
                }
                else if(t + b == distance[a]){
                    ways[a] = (ways[a] + ways[node])%modulo;
                }

            }

        }

        return ways[n-1]%modulo;

    }
}