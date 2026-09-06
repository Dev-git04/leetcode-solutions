class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;           
        }
        int original = x;
        int revNum = 0;
    
    while(x!=0){
        int digit = x%10;
        revNum = revNum *10 + digit;
        x =x/10;
    }
    if ( original == revNum){
        return true;
        }else{
            return false;
        }
    }
}