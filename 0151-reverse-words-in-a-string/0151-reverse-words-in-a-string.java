class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        reverse(arr);
        
        System.out.println();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() >= 1){
             res.append(arr[i]); 
             res.append(" ");
            }       
        }

        res.delete(res.length() - 1,res.length());
        String ans = res.toString();
        return ans;

    }

    public static void reverse(String[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }

    }
}