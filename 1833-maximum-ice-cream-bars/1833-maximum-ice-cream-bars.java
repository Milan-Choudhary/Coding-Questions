class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        int c = 0;

        for(int ele : costs){
            if(ele > coins){
                return c;
            }

            coins -= ele;
            c += 1;
        }

        return c;


    }
}