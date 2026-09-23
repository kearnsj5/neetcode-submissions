

class Solution {

    private ArrayList<List<Integer>> solution;
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        
        solution = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

       // recursive function:
       int index =0;
       int sum = 0;
       recursive(nums, index, target, sum, current);


        return solution;
    }

    private void recursive(int[] nums, int index, int target, int sum, List<Integer> current)
    {
        // base cases:
        if(sum > target)
        {
            return; // exceeded the target value no point continuining.
        }
        if(sum == target) // found valid combination.
        {
            solution.add(new ArrayList<>(current));
        } 

        for(int i =index; i < nums.length; i++)
        {
            
            current.add(nums[i]);
            
            recursive( nums,  i,  target,  sum +nums[i],  current);
            current.remove(current.size() - 1);
        }
       



    }
}
