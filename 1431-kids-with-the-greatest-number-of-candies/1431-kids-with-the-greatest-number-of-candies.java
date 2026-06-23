class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max_candies=0;

        //Find the maximum in the current array
        for(int candy:candies){
            if(candy>max_candies){
                max_candies=candy;
            }
        }

        for(int candy:candies){
            result.add(extraCandies+candy>=max_candies);
        }

        return result;
    }
}