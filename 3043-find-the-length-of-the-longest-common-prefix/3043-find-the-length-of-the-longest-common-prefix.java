class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        int len = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            while(num > 0){
                set.add(num);
                num = num/10;
            }

        }

        boolean move = false;

        for(int num : arr2){
            move = false;
            while(num > 0){
                if(set.contains(num)){
                    int l = Integer.toString(num).length();

                    len = Math.max(l,len);
                    move = true;
                }

                if(move == true){
                    break;
                }
                num = num/10;
            }
        }

        return len;

    }
}