class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += k) {
            StringBuilder sb = new StringBuilder();

            int end = Math.min(i + k, chars.length);
            for (int j = i; j < end; j++) {
                sb.append(chars[j]);
            }

            int rem = k - sb.length();
            for (int z = 0; z < rem; z++) {
                sb.append(fill);
            }

            result.add(sb.toString());
        }

        return result.toArray(new String[0]);
    }
}
