class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            String word = words[i];

            if (map1.containsKey(a) && !map1.get(a).equals(word)){
            return false;
            }
            if (map2.containsKey(word) && map2.get(word) != a){
            return false;
            }
            map1.put(a,word);
            map2.put(word,a);
        }
        return true ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna