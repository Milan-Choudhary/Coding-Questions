class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        Arrays.sort(asteroids);
        long value = mass;

        for(int i = 0; i<asteroids.length; i++){
            if(value < asteroids[i]){
                return false;
            }

            value += asteroids[i];
        }

        return true;

    }
}