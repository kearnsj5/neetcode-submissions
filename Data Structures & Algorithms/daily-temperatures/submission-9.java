// do again found tough.
class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
           Stack<Integer> s = new Stack<>();
           int[] solution = new int[temperatures.length];

           for(int i = 0; i < temperatures.length; i++)
           {
                while(!s.isEmpty() &&   temperatures[i] > temperatures[s.peek()])
                {
                      int prevIndex = s.pop();
                solution[prevIndex] = i - prevIndex;
                }
                s.push(i);
           }

           return solution;
    }
}
