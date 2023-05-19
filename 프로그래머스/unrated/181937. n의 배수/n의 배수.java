class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        for(int i=1;i<51;i++){
            if(num==n*i){
                answer=1;
            }
        }
        return answer;
    }
}