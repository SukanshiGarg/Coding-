class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int freq1[] = new int[128];
        int freq2[] = new int[128];

        for (char ch : p.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            freq2[ch - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) {
            list.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            // remove left character
            freq2[s.charAt(i - p.length()) - 'a']--;

            // add new right character
            freq2[s.charAt(i) - 'a']++;

            if (Arrays.equals(freq1, freq2)) {
                list.add(i - p.length() + 1);
            }
        }

        return list;
    }
}