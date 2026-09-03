class Solution {
    public boolean isAlphaNumeric(Character c){
        if((c-'a' >=0 && c-'a' <26) || (c-'A' >=0 && c-'A' <26) || (c-'0' >=0 && c-'0' < 10)) return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isAlphaNumeric(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }

        int j = list.size()-1;
        int i=0;

        while(i<j){
            if(Character.toLowerCase(list.get(i))!=Character.toLowerCase(list.get(j))) return false;
            i++;j--;
        }

        return true;

    }
}
