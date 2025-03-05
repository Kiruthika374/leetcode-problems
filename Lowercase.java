class Solution {
    public String toLowerCase(String s) {
        char[] ascii=s.toCharArray();
        for(int i=0;i<ascii.length;i++){
            if( (int) ascii[i] <=90&& (int) ascii[i]>=65){
                ascii[i]+=32;
            }
        }
        return new String(ascii);
    }
}
