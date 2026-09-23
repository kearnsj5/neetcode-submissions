// Given an array nums of unique integers, return all possible subsets of nums.

class Solution {
    private ArrayList<List<Integer>> solution;    
    
    public List<List<Integer>> subsets(int[] nums) 
    {
        solution = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        
        int index = 0;
        backtracking(nums, index, current);


        
        return solution;
    }

    private void backtracking(int[] nums, int index, ArrayList<Integer> current )
    {
        // base case:
        if(index <= nums.length)
        {
            solution.add(new ArrayList<>(current) );
        }


        // try every possible choice:
        for(int i = index; i < nums.length; i++)
        {
            // chose
            current.add(nums[i]);

            // explore 
            backtracking( nums, i +1, current);

            // undo
            current.remove(current.size() - 1);
        }


      
    }

}
