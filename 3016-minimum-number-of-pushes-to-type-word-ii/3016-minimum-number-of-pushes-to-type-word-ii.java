class Solution {

    public class Pair{

        char ch;
        int freq;

        Pair(char ch,int freq){
            this.ch = ch;
            this.freq = freq;
        }

    }

    public int minimumPushes(String word) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ele : word.toCharArray()){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }

        int ans = 0;
        int k = 0;
        int add = 1;

        while(pq.size() > 0){
        
        Pair p = pq.poll();

        int val = p.freq;

        ans += (val*add);

        k += 1;

        if(k%8 == 0){
            add += 1;
        }

            
        }

        return ans;


    }
}