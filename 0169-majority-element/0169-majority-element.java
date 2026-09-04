class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int N = nums.length / 2;

        for(int c : nums){
            map.put(c , map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > N){
                return entry.getKey();
            }
        }
        return -1 ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna