class Solution {
    public int minDeletions(String s) {
        
        int[] freq = new int[26];
        int[] filled_positions = new int[s.length() + 1];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a'] += 1;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<26; i++){
            map.put(freq[i],map.getOrDefault(freq[i],0)+1);
            filled_positions[freq[i]] = 1;
        }

        int ans = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        
            int values = entry.getValue();
            int key = entry.getKey();

            int index = key;

            while(values > 1){
                boolean flag = false;

                for(int i = index; i>0; i--){
                    if(filled_positions[i] == 0){
                        filled_positions[i] = 1;
                        flag = true;
                        ans += index - i;
                        break;
                    }
                }

                if(flag == false){
                    ans += index;
                }

                values -= 1;

            }


        }


        return ans;


    }
}