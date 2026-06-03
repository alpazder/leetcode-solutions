package arrays;

class Solution {
    
    public boolean isPalindrome(int x) { 
        int original = x;
        int reversed = 0;
        while (x > 10) {
            int digit = x % 10;
            reversed = x * 10 + digit;      
            x = x / 10;
        }
        if (reversed == original) {
        return true;
    }
        else {
            return false;
        }
    }
}

/* Read the integer, then make a new integer
put the last number first with a loop then do it for the each term
i.e. second from last, goes second...
then save this new number as a new integer
check if first integer == new integer 
if its right return true;
if not return false; */