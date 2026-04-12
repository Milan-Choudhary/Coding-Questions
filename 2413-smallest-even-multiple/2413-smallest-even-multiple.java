class Solution {
    public int smallestEvenMultiple(int n) {
        
        int num = n;

        while(num%n != 0 || num%2 != 0){
            num += 1;
        }

        return num;


    }
}