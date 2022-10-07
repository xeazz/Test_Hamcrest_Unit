public class ReverseString {
    public String reverseString(String str) {
        String rightStr;
        String leftStr;
        int length = str.length();

        if (length <= 1) {
            return str;
        }

        leftStr = str.substring(0, length / 2);
        rightStr = str.substring(length / 2, length);

        return reverseString(rightStr) + reverseString(leftStr);
    }
}
