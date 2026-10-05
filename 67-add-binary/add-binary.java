class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = digitA + digitB + carry;
            int digit = sum % 2;
            carry = sum / 2;
            result.append(digit);
            if (i >= 0) {
                i--;
            }
            if (j >= 0) {
                    j--;
            }
        }
        result.reverse();
        return result.toString();
    }
}