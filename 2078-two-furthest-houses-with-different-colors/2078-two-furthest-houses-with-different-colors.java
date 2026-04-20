class Solution {
    public int maxDistance(int[] colors) {
        
        int color = colors[0];
        int fp = 0;
        int lp = colors.length - 1;

        if(colors[0] != colors[colors.length - 1]){
            return Math.abs(colors.length - 1);
        }

        int k = 1;
        int ans = 0;
        while(k < colors.length - 1){
            if(colors[k] != color){
                if(k < colors.length/2){
                    ans = Math.max(ans,Math.abs(lp - k));
                }
                else{
                    ans = Math.max(ans,Math.abs(fp - k));
                }
            }

            k += 1;
        }

        return ans;

    }
}