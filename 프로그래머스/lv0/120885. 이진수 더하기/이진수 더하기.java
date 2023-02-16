class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(toBinary(bin1) + toBinary(bin2));
    }

    public int toBinary(String bin) {
        return Integer.parseInt(bin, 2);
    }
}