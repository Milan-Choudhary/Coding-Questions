class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] lower = new int[26];
        int[] upper = new int[26];

        HashMap<Character,Integer> up = new HashMap<>();
        HashMap<Character,Integer> low = new HashMap<>();


        for(int i = 0; i<word.length(); i++){
            char ele = word.charAt(i);

            if(Character.isUpperCase(ele)){
                upper[ele - 'A'] += 1;
                if(!up.containsKey(ele)){
                    up.put(ele,i);
                }
            }
            else{
                lower[ele - 'a'] += 1;
                low.put(ele,i);
            }
        }

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int c = 0;

        for(int i = 0; i<26; i++){
            if(upper[i] != 0 && lower[i] != 0){
                char ele = alpha.charAt(i);
                char ele2 = Character.toUpperCase(ele);
                if(low.get(ele) < up.get(ele2)){
                    c += 1;
                }
            }
        }

        return c;


    }
}