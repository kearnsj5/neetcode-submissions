// package NeetCode150;

// import java.util.*;


class MinStack {

    private ArrayList<Integer> stack;
    private ArrayList<Integer> minNumberStack;

    public MinStack() 
    {
       stack = new ArrayList<>();
       minNumberStack = new ArrayList<>();

    }
    
    public void push(int val) 
    {
       stack.add(val);

       if (minNumberStack.size() ==0)
       {
            minNumberStack.add(val);
       }
       else
    {
        int topOfMin = minNumberStack.get(minNumberStack.size() - 1);
        int newMin = Math.min(topOfMin, val);
       minNumberStack.add(newMin);

    }
       
       
    }
    
    public void pop() 
    {
        // if(stack.size() == 0)
        // {
        //     return;
        // }

        // int i = 0; 
        // while(i < stack.size())
        // {

        // }

        int size = stack.size();
        int i = size -1;
        stack.remove(i);

        int topOfMin = minNumberStack.remove(minNumberStack.size() - 1);



    }
    
    public int top() {
        int size = stack.size();
        int i = size -1;
        return stack.get(i);

    }
    
    public int getMin() 
    {
        return minNumberStack.get(minNumberStack.size() - 1);
    }
}
