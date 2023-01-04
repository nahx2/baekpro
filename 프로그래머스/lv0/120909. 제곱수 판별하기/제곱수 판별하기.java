class Solution {
    public int solution(int n) {
        int answer = 0;
        //answer = 2;
        for(int i=1; i<=1000;i++){
            if(n==i*i){
                answer = 1;
                break;
            }
            else if(n!=i*i){
                answer = 2;
            }
        }
        return answer;
    }
}