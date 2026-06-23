class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ele : s.toCharArray()){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int odd = 0;
        int odd_count = 0;
        int even_count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if(entry.getValue()%2 != 0){
                if(entry.getValue() > odd){
                    if(odd != 0){
                         odd_count += odd - 1;
                    }

                    odd = entry.getValue();
                }
                else{
                    odd_count += entry.getValue() - 1;
                }
            }
            else{
                even_count += entry.getValue();
            }

        }

        return odd + odd_count + even_count;


    }
}