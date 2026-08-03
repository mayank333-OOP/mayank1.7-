class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int left = 0 ;
      int sum = 0 ; 
      int maxSum = Integer.MIN_VALUE ;


      for(int right =0 ; right <nums.length ; right++){
         sum += nums[right] ;
         if(right - left + 1 == k){
            if(sum > maxSum){
                maxSum = sum ;
            }
            sum -= nums[left] ;
            left++ ;
           }
        }
        double avg  = (double) maxSum/k ;
        return avg ;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna