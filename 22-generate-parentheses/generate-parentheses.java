import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> result = new ArrayList<>();

    public boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                count++;
            else
                count--;
            if (count < 0)
                return false;
        }
        return count == 0;
    }

    public void backTrack(StringBuilder curr, int n) {
        if (curr.length() == 2 * n) {
            if (isValid(curr.toString())) {
                result.add(curr.toString());
            }
            return;
        }
        curr.append('(');
        backTrack(curr, n);
        curr.deleteCharAt(curr.length() - 1);

        curr.append(')');
        backTrack(curr, n);
        curr.deleteCharAt(curr.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder curr = new StringBuilder();
        backTrack(curr, n);
        return result;
    }
}