class Solution {
    public boolean canReach(int[] arr, int start) {
        
        boolean[] vis = new boolean[arr.length];
        boolean ans = compute(arr,start,vis);

        return ans;
    }

    public static boolean compute(int[] arr,int i,boolean[] vis){

        if(i >= arr.length || i < 0 || vis[i] == true){
            return false;
        }
        else if(arr[i] == 0){
            return true;
        }

        vis[i] = true;

        boolean a = compute(arr,i+arr[i],vis);
        boolean b = compute(arr,i-arr[i],vis);

        return a || b;


    }
}