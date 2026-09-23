class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        HashSet<List<Integer>> unique = new HashSet<>();

        int target = 0; // target value always.


        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i +1; j <nums.length; j++)
            {
                for(int k = j+1; k < nums.length; k++)
                {
                    if( nums[i] + nums[j] + nums[k] == target )
                    {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        
                        unique.add(triplet);
                    }
                }
            }
        }

        List<List<Integer>> solution = new ArrayList<>(unique);

        return solution;
    }
}