class Solution {
    public boolean canAliceWin(int n) {
        int m = (int) Math.sqrt(433 - 8 * n) - 1;
        return (m & 2) == 0;
    }
}