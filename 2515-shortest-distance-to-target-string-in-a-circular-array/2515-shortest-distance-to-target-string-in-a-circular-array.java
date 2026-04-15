class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        int n = words.length;
        int ans = n;
        int right = startIndex;
        int left = startIndex;
        int c = 0;

        while(c < words.length){
            
            if(words[right%n].equals(target)){
                ans = Math.min(ans,c);
            }

            right += 1;
            c += 1;
        }

        c = 0;
        while(c < words.length){
            
            if(words[(left+n)%n].equals(target)){
                ans = Math.min(ans,c);
            }

          left -= 1;
          c += 1;
        }


        ans = ans == n ? -1 : ans;
        return ans;

    }
}