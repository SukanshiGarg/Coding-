class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int units=0;
        int boxTaken=0;
        for(int boxType[]: boxTypes){
           if(truckSize <= 0) break;
           boxTaken=Math.min(truckSize,boxType[0]);
           units += boxTaken*boxType[1];
           truckSize -= boxTaken;
        }
        return units;
    }
}