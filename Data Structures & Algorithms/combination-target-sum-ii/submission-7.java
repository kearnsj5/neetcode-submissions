


class Solution {

    private ArrayList<List<Integer>> solution;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        
        
        solution = new ArrayList<>();

        int index= 0;
        int sum =0;

        ArrayList<Integer> current = new ArrayList<>();

        backtracking(candidates, target, index, sum, current);

        return solution;

    }

    private void backtracking(int[] candidates, int target, int index, int sum, ArrayList<Integer> current )
    {
        //base case:
        if(sum > target)
        {
            return;
        }

        //base case :
        if(sum == target)
        {
            solution.add(new ArrayList<>(current));
            return;
        }

        for(int i = index; i < candidates.length; i++)
        {
            if(i > index && candidates[i] == candidates[i - 1])
            {
                    continue;
            }
            //add
            current.add(candidates[i]);

            //explore

            backtracking(candidates, target, i+1, sum+ candidates[i], current);

            //remove
            current.remove(current.size() -1);
        }
    }
}
