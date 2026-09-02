class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        // Count characters in ransomNote
        for (char c : ransomNote.toCharArray()) {
            ransomMap.put(c, ransomMap.getOrDefault(c, 0) + 1);
        }

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check if magazine has enough characters
        for (char c : ransomMap.keySet()) {
            if (ransomMap.get(c) > magazineMap.getOrDefault(c, 0)) {
                return false;
            }
        }

        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna