class Solution {
    public boolean isValidPair(Character opening, Character closing){
            if((opening=='(' && closing ==')') || (opening=='{' && closing =='}') || (opening=='[' && closing ==']')) return true;
            return false;
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{

                // if(stack.peek)
                if(stack.isEmpty()) return false;
                char temp = stack.peek();
                if(!isValidPair(temp,c)) return false;
                stack.pop();
            }
        }

        if(stack.isEmpty()) return true;
        return false;
        
    }
}
