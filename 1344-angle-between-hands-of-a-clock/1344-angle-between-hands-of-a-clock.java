class Solution {
    public double angleClock(int hour, int minutes) {

        //1H = 30 degrees
        //1 minute = 6 degrees

        double h = 30 * hour;
        double add = (minutes*30)/(double)60;
        h += add;

        h = h%360;
        

        double m = minutes * 6;

        double d1 = Math.abs(m - h);
        double d2 = Math.abs(360 - d1);

        
        return Math.min(d1,d2);
        
    }
}