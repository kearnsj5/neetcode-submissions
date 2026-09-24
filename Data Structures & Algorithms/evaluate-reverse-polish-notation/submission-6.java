class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> s = new Stack<>();
        
        // loop through the the tokens stack
        for(int i =0; i < tokens.length; i++)
        {
            if(isOperator(tokens[i]))
            {
               String operator = tokens[i];
               int number1 = s.pop();
               int number2 = s.pop();
               int opAppliedNumber = applyOperator(number1, number2, operator);
               s.push(opAppliedNumber);

            }
            // if it not an operator it is a number and we push onto  the stack AS AN INT.
            else
            {
                int currNumber = Integer.parseInt(tokens[i]);
                s.push(currNumber); 
            }
        }
        return s.pop();
    }

    //helper function that decides if the token is 
    // an operator 
    private boolean isOperator(String token)
    {
        return token.equals("+") ||
           token.equals("-") ||
           token.equals("*") ||
           token.equals("/");
        
    }
    
    //helper function to apply the operator:
    private int applyOperator(int number1 , int number2, String operator)
    {
        if( operator.equals("+") )
        {
           return  number1+number2;
        }
        if( operator.equals("-") )
        {
           return  number2-number1;
        }
        
        if( operator.equals("*") )
        {
           return  number1*number2;
        }
        //else it is "/"
        return number2 / number1;

    }
}
