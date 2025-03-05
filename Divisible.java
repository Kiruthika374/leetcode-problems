class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int sums=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                 sum=sum+i;
            }
            else{
                sums=sums+i;
            }
        }    
        int result =sum-sums;
        return result;
    }
}
