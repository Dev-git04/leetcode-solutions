class Solution {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 2;
        if ( n == 1 ){
            return prev1;
        }
        for( int i = 3 ; i <= n ; i++){
            int current = prev1 + prev2;
            prev1 = prev2 ; 
            prev2 = current;
        }
        return prev2;
    }
}