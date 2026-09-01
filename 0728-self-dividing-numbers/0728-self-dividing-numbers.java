class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ; i<=right;i++){
            int temp = i;
            boolean valid = true;

            while(temp > 0){
                int digit = temp%10;
                if(digit == 0 || i%digit !=0){
                    valid = false;
                    break;
                }
                temp /=10;
            }
            if(valid){
                list.add(i);
            }
        }
        return list;
    }
}