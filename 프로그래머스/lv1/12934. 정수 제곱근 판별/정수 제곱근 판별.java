class Solution {
    public long solution(long n) {
        long a = -1;
        for(long x=0;x<=n;x++){
            if(n==x*x){
                a = (x+1)*(x+1);
                return a;
            }
        }
       return a;
    }
}