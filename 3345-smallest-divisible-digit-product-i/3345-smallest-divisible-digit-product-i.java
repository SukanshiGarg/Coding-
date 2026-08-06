class Solution {
    public int smallestNumber(int n, int t) {
           while (product(n) % t != 0) {
            n++;
        }

        return n;
    }

    public int product(int n){
        int p=1;
        while(n>0){
            int rem= n%10;
            p=p*rem;
            n = n/10;
        }
        return p;
    }
}