class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder res = new StringBuilder();

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        int sum = 0;

        for(int i = 0; i<words.length; i++){
            String use = words[i];

            for(int k = 0; k<use.length(); k++){
                sum += weights[use.charAt(k) - 'a'];
            }

            int val = sum%26;
            
            res.append(alpha.charAt(26 - val - 1));

            sum = 0;

        }

        return res.toString();


    }
}