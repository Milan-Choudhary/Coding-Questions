class Solution {

    class Pair{

        int num;
        int sum;

        Pair(int num,int sum){
            this.num = num;
            this.sum = sum;
        }


    }

    public int minSwaps(int[] nums) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.sum == b.sum ? a.num - b.num : a.sum - b.sum);

        int[] new_nums = new int[nums.length];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){

            int num = nums[i];
            int copy = num;

            int digit_sum = 0;

            while(num > 0){
                digit_sum += num%10;
                num = num/10;
            }

            pq.add(new Pair(copy,digit_sum));

        }

        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){

            Pair p = pq.poll();

            arr[i] = p.num;

            map.put(arr[i],i);

        }

        int ans = 0;
        int count = 0;

        boolean[] vis = new boolean[nums.length];

        for(int i = 0; i<nums.length; i++){

            count = 0;

            if(vis[i] != false){
                continue;
            }

            vis[i] = true;
            count += 1;
            int index = map.get(nums[i]);

            while(vis[index] == false){

                count += 1;
                vis[index] = true;
                index = map.get(nums[index]);

            }

            ans += count - 1;

        }


        return ans;
        
    }
}