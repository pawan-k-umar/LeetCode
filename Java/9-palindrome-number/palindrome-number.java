class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        String n = Integer.toString(x);
        return n.equals(new StringBuilder(n).reverse().toString());
    }
}