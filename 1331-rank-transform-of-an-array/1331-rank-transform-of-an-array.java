class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        HashMap<Integer,Queue<Integer>> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }
            else{
                map.put(arr[i],new LinkedList<>());
                map.get(arr[i]).add(i);
            }
        }

        int[] ans = new int[arr.length];

        Arrays.sort(arr);
        int rank = 1;

        for(int i = 0; i<arr.length; i++){
            
            if(i != 0 && arr[i] > arr[i-1]){
                rank += 1;
                int index = map.get(arr[i]).poll();
                ans[index] = rank;
            }
            else{
                int index = map.get(arr[i]).poll();
                ans[index] = rank;
            }

        }


        return ans;

    }
}