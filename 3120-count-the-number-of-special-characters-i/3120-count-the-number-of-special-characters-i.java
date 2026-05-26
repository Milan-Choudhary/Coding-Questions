class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] lower = new int[26];
        int[] upper = new int[26];

        for(int i = 0; i<word.length(); i++){
            char ele = word.charAt(i);
            if(Character.isUpperCase(ele)){
                upper[ele-'A'] += 1;
            }
            else{
                lower[ele-'a'] += 1;
            }
        }

        int c  = 0;
        for(int i = 0; i<26; i++){
            if(upper[i] != 0 && lower[i] != 0){
                c += 1;
            }
        }

        return c;


    }
}