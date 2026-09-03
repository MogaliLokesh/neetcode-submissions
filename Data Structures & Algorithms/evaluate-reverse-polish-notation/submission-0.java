class Solution {
    public int getValue(int first, int second, String str){
        switch(str){
            case "*":
                return first*second;
            case "/":
                return first/second;
            case "+":
                return first+second;
            case "-":
                return first-second;
        }
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str: tokens){
            if(str.equals("+") ||str.equals("-") || str.equals("*") || str.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(getValue(first,second,str));
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.peek();
    }
}
