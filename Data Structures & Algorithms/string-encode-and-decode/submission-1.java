class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str: strs){
            res.append(str.length()).append("#").append(str);
        }

        return res.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int cursor=0;
        // for(int i=0)
        // int i=cursor
        while(cursor<str.length()){
            int i=cursor;
            while(str.charAt(i)!='#'){
                i++;
            }
            int len = Integer.parseInt(str.substring(cursor,i));
            res.add(str.substring(i+1,i+1+len));
            cursor=i+1+len;
        }
        //get substring of cursor to i

        return res;
    }
}
