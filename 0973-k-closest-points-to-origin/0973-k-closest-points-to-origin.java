class Solution {

    public class Pair{

        double val;
        int x;
        int y;

        Pair(double val,int x,int y){
            this.val = val;
            this.x = x;
            this.y = y;
        }

    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.val,a.val));

        for(int i = 0; i<points.length; i++){
            int[] cord = points[i];
            int x = cord[0];
            int y = cord[1];

            double val = (double)Math.pow(x,2);
            double data = (double)Math.pow(y,2);

            double ans = val + data;

            pq.add(new Pair(ans,x,y));

            while(pq.size() > k){
                pq.poll();
            }

        }

        int[][] ans = new int[k][2];

        for(int i = 0; i<ans.length; i++){
            Pair P = pq.poll();

            ans[i][0] = P.x;
            ans[i][1] = P.y;

        }

        return ans;

    }
}