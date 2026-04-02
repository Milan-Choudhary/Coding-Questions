class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stack = new Stack<>();
        int[] width = new int[heights.length];
        int[] length = new int[heights.length];

        for(int i = 0; i<heights.length; i++){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }

            width[i] = stack.size() == 0 ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        for(int i = heights.length - 1; i>=0; i--){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }

            length[i] = stack.size() == 0 ? heights.length - i : stack.peek() - i;
            stack.push(i);
        }


        int ans = 0;
        int res = 0;

        for(int i = 0; i<heights.length; i++){
            res = heights[i]*(length[i] + width[i] - 1);
            ans = Math.max(ans,res);
        }
        
        return ans;
        
    }
}