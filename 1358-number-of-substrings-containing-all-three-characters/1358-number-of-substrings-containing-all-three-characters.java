class Solution {
    public int numberOfSubstrings(String s) {
       
        int c = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        while(right < s.length()){

            if(s.charAt(right) == 'a' || s.charAt(right) == 'b' || s.charAt(right) == 'c'){
                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            }

            while(left < s.length() && map.size() == 3){
                c += s.length() - right;

                char ele = s.charAt(left);

                if(map.containsKey(ele)){
                    map.put(ele,map.get(ele)-1);
                    
                    if(map.get(ele) == 0){
                        map.remove(ele);
                    }

                }

                left += 1;
            }

            right += 1;


        }

        return c;

    }
}