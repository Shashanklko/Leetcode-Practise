class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y = reverse(x , 0);
        return x==y;
    }
    public int reverse(int y, int rev){
        if(y==0){
            return rev;
        }
        int rem = y%10;
        rev = rev*10 + rem;
        return reverse(y/10 , rev);
    }
}