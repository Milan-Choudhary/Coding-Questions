class Solution {
    public int minMirrorPairDistance(int[] nums) {
        
        int ans = Integer.MAX_VALUE;

        HashMap<Long,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            long value = nums[i];
            if(map.containsKey(value)){
                ans = Math.min(Math.abs(i-map.get(value)),ans);
                long val = reverse(nums[i]);
                map.put(val,i);
            }
            else{
                long val = reverse(nums[i]);
                map.put(val,i);
            }

            if(ans == 1){
                break;
            }
        }

        ans = ans == Integer.MAX_VALUE ? -1 : ans;
        return ans;

    }

    public static long reverse(long num){

        long copy = 0;

        while(num > 0){
            long res = num%10;
            copy = copy*10 + res;
            num = num/10;
        }

        return copy;

    }
}