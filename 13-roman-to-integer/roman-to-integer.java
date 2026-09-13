class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = 0;
            int next = 0;

            if (s.charAt(i) == 'I')
                current = 1;
            else if (s.charAt(i) == 'V')
                current = 5;
            else if (s.charAt(i) == 'X')
                current = 10;
            else if (s.charAt(i) == 'L')
                current = 50;
            else if (s.charAt(i) == 'C')
                current = 100;
            else if (s.charAt(i) == 'D')
                current = 500;
            else if (s.charAt(i) == 'M')
                current = 1000;

            if (s.charAt(i + 1) == 'I')
                next = 1;
            else if (s.charAt(i + 1) == 'V')
                next = 5;
            else if (s.charAt(i + 1) == 'X')
                next = 10;
            else if (s.charAt(i + 1) == 'L')
                next = 50;
            else if (s.charAt(i + 1) == 'C')
                next = 100;
            else if (s.charAt(i + 1) == 'D')
                next = 500;
            else if (s.charAt(i + 1) == 'M')
                next = 1000;
            if (current < next)
                answer = answer - current;
            else
                answer = answer + current;
        }
        int last = 0;
        if (s.charAt(s.length() - 1) == 'I')
            last = 1;
        else if (s.charAt(s.length() - 1) == 'V')
            last = 5;
        else if (s.charAt(s.length() - 1) == 'X')
            last = 10;
        else if (s.charAt(s.length() - 1) == 'L')
            last = 50;
        else if (s.charAt(s.length() - 1) == 'C')
            last = 100;
        else if (s.charAt(s.length() - 1) == 'D')
            last = 500;
        else if (s.charAt(s.length() - 1) == 'M')
            last = 1000;

        answer = answer + last;
        return answer;
    }
}

