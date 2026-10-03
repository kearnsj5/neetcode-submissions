class Solution {
    public int findMin(int[] nums) 
    {
        int l = 0; //pointer for the left side. 
        int r = nums.length - 1; // poiter for the right side. 
        while(l< r)
        {
            int mid = (l+r)/2; //mid pointer
            if(nums[mid]> nums[r])
            {
               l = mid +1;
            }
            else
            {
                r = mid;
            }
            
        }
        return nums[l];
    }
}
