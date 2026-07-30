class Solution {
    public int minimumPushes(String word) {
        
        int ans = 0;

        int l = word.length();

        if(word.length() <= 8){
            return 1*word.length();
        }
        else if(word.length() > 8 && word.length() <= 16){
            return (word.length() - 8)*2 + 8;
        }
        else if(word.length() > 16 && word.length() <= 24){
            return (word.length() - 16)*3 + (8)*2 + 8;
        }


        return (word.length() - 24)*4 + 8*3 + 8*2 + 8;


    }
}