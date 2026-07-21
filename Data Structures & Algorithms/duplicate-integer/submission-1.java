class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1){
            return false;
        }
        int unique = nums[0] ; 
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++){   
            if(unique == nums[i]){
                return true;
            }
            else{
                unique = nums[i];
            }
        }
                return false;
    }
}