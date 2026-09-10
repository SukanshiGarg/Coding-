class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroid<0){
                if(stack.peek() < -asteroid){
                    //jo asteroid adar padha hai woh remove ho jayega
                    stack.pop();
                }
                else if(stack.peek()== -asteroid){
                    stack.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                stack.push(asteroid);
            }

        }
        int arr[] = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            arr[i] = stack.get(i);
        }
        return arr;
        
    }
}