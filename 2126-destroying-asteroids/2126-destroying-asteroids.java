class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        Long currentMass =(long) mass;
        for(int a : asteroids){
           if(currentMass < a){
             return false;
           }

           currentMass += a;

        }
        return true;
    }
}