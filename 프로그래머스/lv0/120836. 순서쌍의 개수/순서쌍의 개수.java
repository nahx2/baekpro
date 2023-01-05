class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n;i++){
            //for(int j=n;j>=1;j--){
            //    if(n==i*j){
            //        ++answer;
            //    }
            // }
            if(n%i==0){
                ++answer;
            }
        }
        return answer;
    }
}