class Solution {
    public int maxArea(int[] heights) 
    {
       int solution = 0;
       for(int i = 0; i < heights.length; i ++)
       {
        for(int j = i+1; j< heights.length; j++)
        {
          int minNumber = Math.min(heights[i], heights[j]);
          int width = j- i;

          int area = width * minNumber;
          if(area> solution)
          {
            solution = area;
          }
            
        }
       }
       return solution;
    }
}

