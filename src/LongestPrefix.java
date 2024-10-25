public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = findLongestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Continuously shorten the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
