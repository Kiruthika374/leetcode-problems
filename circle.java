class Solution {
    public boolean judgeCircle(String moves) {
        int count = 0;
        int count1 = 0;
        for(int i = 0 ; i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                count++;
            }
            else if(moves.charAt(i)=='D'){
                count--;
            }
            else if(moves.charAt(i)=='R'){
                count1++;
            }
            else if(moves.charAt(i)=='L'){
                count1--;
            }                        
        }
        return (count==0&&count1==0);
    }
    }
