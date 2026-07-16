class Solution {
    public long gcdSum(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] prefix_gd = new int[nums.length];
        int value = 0;

        for(int i = 0; i<nums.length; i++){
            value = Math.max(nums[i],value);
            prefix_gd[i] = compute(value,nums[i]);
        } 

        Arrays.sort(prefix_gd);

        int left = 0;
        int right = prefix_gd.length - 1;

        long sum = 0;

        while(left < right){
            sum += compute(prefix_gd[left],prefix_gd[right]);
            left += 1;
            right -= 1;
        }

        return sum;       
        
    }

    public static int compute(int a,int b){

        if(a == 0){
            return b;
        }

        return compute(b%a,a);
        
    }
}