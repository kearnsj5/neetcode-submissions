class Solution {
    ArrayList<List<Integer>> solution;

    public List<List<Integer>> permute(int[] nums) 
    {
        solution = new ArrayList<>();

        int length = nums.length;

       ArrayList<Integer> current = new ArrayList<>();

       boolean [] marked = new boolean[length]; // all set to false - just like graphing questions.

       backtracking(current ,nums, marked, length);

       return solution;
        
    }


    private void backtracking( ArrayList<Integer> current ,int[] nums,boolean [] marked, int length)
    {
        //base case : we have 
        if(current.size() == length)
        {
            solution.add(new ArrayList<>(current)); // add new solution;
        }

        for(int i = 0; i < nums.length; i++)
        {
            // all has to take place because we have found one not used.
            if(!marked[i])
            {
                //add
                current.add(nums[i]);
                marked[i] = true;
                //explore/backtrack 
                backtracking(current, nums, marked, length);

                //remove
                current.remove(current.size()-1);
                marked[i] = false;
            }
            
            
        }
    }
}