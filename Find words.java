class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> obj=new ArrayList<>();
       for(int i=0;i<words.length;i++){
        String str=words[i];
        for(int j=0;j<str.length();j++){
            char c=str.charAt(j);
            if(c==x){
                obj.add(i);
                break;
            }
        }
       }
       return obj;
    }
}
