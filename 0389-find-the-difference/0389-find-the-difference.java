class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] ele1 = s.toCharArray();
        char[] ele2 = t.toCharArray();

        Arrays.sort(ele1);
        Arrays.sort(ele2);

        for(int i = 0; i<ele1.length; i++){
            if(ele1[i] != ele2[i]){
                return ele2[i];
            }
        }

        return ele2[ele2.length - 1];

    }
}