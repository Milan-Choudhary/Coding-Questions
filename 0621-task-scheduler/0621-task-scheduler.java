class Solution {
    class Pair{

        char val;
        int freq;

        Pair(char val,int freq){
            this.val = val;
            this.freq = freq;
        }

    }

    public int leastInterval(char[] tasks, int n) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<tasks.length; i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            pq.add(new Pair(entry.getKey(),entry.getValue()));

        }

        Queue<Pair> q = new LinkedList<>();

        int count = 0;
        n += 1;
        int refill = n;

        while(pq.size() > 0){

            Pair p = pq.poll();
            n -= 1;
            count += 1;

            p.freq -= 1;

            if(p.freq != 0){
                q.add(p);
            }

            if(pq.size() == 0 || n == 0){
                if(q.size() != 0){
                    count += n;
                }
                
                while(q.size() > 0){
                    pq.add(q.poll());
                }
                n = refill;
            }

        }

        return count;


    }
}