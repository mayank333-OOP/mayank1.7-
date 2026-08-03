class Solution {
    public boolean isPalindrome(int original) {
        if(original<0) return false ;
        int rem = 0, num= original;

        while (num != 0) {
             rem = rem *10 +  num %10 ;
             num /= 10 ;
        }
        if(original == rem)
        return true ;
        else 
        return false ;
    }
}