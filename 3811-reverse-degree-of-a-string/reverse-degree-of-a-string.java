class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        int position = 1;
        for(int i = 0; i < s.length(); i++){
           int rev = 26 - ( s.charAt(i) - 'a');
           total = total + rev *position;
           position ++;
        }
        return total;

    }
}