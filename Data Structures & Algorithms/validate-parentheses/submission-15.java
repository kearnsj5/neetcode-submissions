class Solution {
    public boolean isValid(String s) 
    {
         Stack<Character> stack = new Stack<>();

         for(char c : s.toCharArray())
         {
            if(c == '(' || c == '{' || c== '[')
            {
                stack.push(c);
            }
            else 
            {
                if( stack.isEmpty() || !matchingPair(stack.peek(), c ) )
                {
                    return false;
                }
                 stack.pop();
            }
         }
        return stack.isEmpty();
        
    }

    private boolean matchingPair(char openingBracket ,  char closingBracket)
    {
        return (openingBracket == '(' && closingBracket == ')') ||
               (openingBracket == '{' && closingBracket == '}') ||
               (openingBracket == '[' && closingBracket == ']');
    }
}
