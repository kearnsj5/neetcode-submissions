

// You are given an array nums of integers, which may contain duplicates. Return all possible subsets.
//The solution must not contain duplicate subsets. You may return the solution in any order.

class Solution {

    ArrayList<List<Integer>> solution;
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        solution = new ArrayList<>();

        Arrays.sort(nums); // nums is now sorted 

        ArrayList<Integer> curent = new ArrayList<>(); // temp arrayList.

        int index = 0;

        backtracking(nums, index, curent);

        return solution;
    }

    private void backtracking(int[] nums, int index, ArrayList<Integer> current)
    {
        // base case:
       // base case:
       if(index <= nums.length)
        {
            solution.add(new ArrayList<>(current) );
        }


        // THIS IS EXACTLY LIKE COMBINATION SUM II. I Knew it felt familair. 
        // Have to start noticing these patterns this is what cracks these problems open.
        for(int i = index; i < nums.length; i++)
        {
            if(i > index && nums[i] == nums[i-1])
            {
                continue;
            }
            current.add(nums[i]);

            //explore:
            backtracking(nums, i+1, current);

            //remoive
            current.remove(current.size()-1);
        }
    }
}
