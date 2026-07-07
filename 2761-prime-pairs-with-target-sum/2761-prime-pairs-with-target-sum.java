class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        for(int i = 2; i<=n/2; i++){
            if(isPrime(i,n-i)){
                res.add(i);
                res.add(n-i);
                list.add(new ArrayList<>(res));
                res.clear();
            }
        }

        return list;

    }

    public static boolean isPrime(int num1,int num2){

        int limit1 = (int)Math.sqrt(num1);
        for(int k = 2; k<=limit1; k++){
            if(num1%k == 0){
                return false;
            }
        }

        int limit2 = (int)Math.sqrt(num2);
        for(int k = 2; k<=limit2; k++){
            if(num2%k == 0){
                return false;
            }
        }

        return true;

    }
}