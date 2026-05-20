class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int[] count = new int[A.length];

        for(int i = 0; i<A.length; i++){

            if(A[i] == B[i]){

                if(i >= 1){
                    count[i] = count[i-1] + 1;
                }
                else{
                    count[i] = 1;
                }

            }
            else{

                int c1 = 0;
                int c2 = 0;
                if(set1.contains(B[i])){
                    c1 += 1;
                }

                if(set2.contains(A[i])){
                    c2 += 1;
                }

                if(i >= 1){
                    count[i] = count[i-1] + c1 + c2;
                }
                
            }

            set1.add(A[i]);
            set2.add(B[i]);


        }

        return count;

    }
}