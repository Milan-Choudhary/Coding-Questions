class Solution {
    public static class Pair{

        String s;

        Pair(String s){
            this.s = s;
        }

    }
    public String largestNumber(int[] nums) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (b.s+a.s).compareTo(a.s+b.s));

        for(int num : nums){
            pq.add(new Pair(Integer.toString(num)));
        }

        StringBuilder ans = new StringBuilder();

        while(pq.size() > 0){
            Pair p = pq.poll();

            ans.append(p.s);
        }

        if(ans.charAt(0) == '0'){
            return "0";
        }

        return ans.toString();


    }


}