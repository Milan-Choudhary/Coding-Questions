class Solution {
    public int largestAltitude(int[] gain) {
        int initial = 0;
        int ans = 0;

        for(int i = 0; i<gain.length; i++){
            initial += gain[i];
            ans = Math.max(ans,initial);
        }

        return ans;
    }
}