class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {

            if (isVowel(s.charAt(right))) {
                count++;
            }

            if (right - left + 1 == k) {

                if (count > maxCount) {
                    maxCount = count;
                }

                if (isVowel(s.charAt(left))) {
                    count--;
                }

                left++;
            }
        }

        return maxCount;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna