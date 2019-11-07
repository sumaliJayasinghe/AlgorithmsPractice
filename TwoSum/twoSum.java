class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int pos_1 = 0;
        int pos_2 = 0;
        int[] arr = new int[2];
        
        
        for(int i = 0; i < nums.length -1;i++){
            int pivot = nums[i];
              
                for(int j = i; j < nums.length -i-1; j++){
                    if(pivot+nums[j] == target){
                        arr[0] =  i;
                        arr[1] = j;
                    }
                }
        }
        
        
        return arr;
    }
}
