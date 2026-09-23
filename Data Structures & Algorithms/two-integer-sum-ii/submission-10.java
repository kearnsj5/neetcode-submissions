class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int i = 0;
        int j = numbers.length - 1;
        int[] solution = new int[2];

        while(i < j)
        {
            int sum = numbers[i] + numbers[j];
            if(sum == target)
            {
                solution[0] = i +1;
                solution[1] = j +1;
                return solution;
            }
            else if (sum > target)
            {
                j--;
            }
            else 
            {
                i++;
            }


        }

        return solution;

    }
}
