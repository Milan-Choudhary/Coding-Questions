class Solution {
    public String smallestPalindrome(String s) {
        
        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a'] += 1;
        }

        StringBuilder res = new StringBuilder();

        Character ch = ' ';
        int count = 0;

        String use = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i<=25; i++){

            if(freq[i]%2 != 0){
                ch = use.charAt(i);
                count = 1;
                freq[i] -= 1;
            }

            int add = freq[i]/2;
            while(add > 0){
                res.append(use.charAt(i));
                add -= 1;
            }

        }

        String to_add = "";

        while(count > 0){
            to_add += ch;
            count -= 1;
        }

        int pos = res.length();

        StringBuilder rev = new StringBuilder(res.toString());
        res.reverse();
        rev.append(res);

        rev.insert(pos,to_add);

        return rev.toString();


    }
}