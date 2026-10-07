class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int index = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[index] = nums1[i];
                i += 1;
            }
            else{
                arr[index] = nums2[j];
                j += 1;
            }

            index += 1;
        }

        while(i < nums1.length){
            
            arr[index] = nums1[i];
            i += 1;
            index += 1;
        }

         while(j < nums2.length){
            
            arr[index] = nums2[j];
            j += 1;
            index += 1;
        }


        int midpoint = 0;
        int midpoint1 = 0;
        int midpoint2 = 0;
        double ans = 0;

        if(arr.length%2 != 0){
            midpoint = arr[arr.length/2];
            ans = midpoint;
        }
        else{
            midpoint1 = arr[arr.length/2];
            midpoint2 = arr[arr.length/2 - 1];

            ans = midpoint1 + midpoint2;
            ans = ans/2; 
        }

        return ans;


    }
}