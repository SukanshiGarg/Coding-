class Solution {
    private static final int mod = (int) 1e9+7;
    public int countPairs(int[] deliciousness) {
        //Step 1: Find the maximum Value and Multiply it by 2 
        // To multiply by 2 we use left shift since a<<1 is same as a*2

        int maxValue = Arrays.stream(deliciousness).max().getAsInt();
        int maxPossibleValue = maxValue << 1;

        //initialise a result counter 
        //To count good Meals

        int result = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        //iterate through each delicious value 
        for(int value : deliciousness){
            // Check all possible powers of 2 up to maxPossibleSum
            for(int power=1;power<=maxPossibleValue;power<<=1){

               int complement = power - value;

            result = (result + frequencyMap.getOrDefault(complement, 0)) % mod;
              
            }

             //Update the frequnecy map 

               frequencyMap.merge(value,1,Integer::sum);

        }

        return result;
    }
}