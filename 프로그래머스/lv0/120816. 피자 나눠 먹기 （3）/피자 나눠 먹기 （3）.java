class Solution {
    public int solution(int slice, int n) {
        //slice 피자 조각 수
        //n 피자를 먹는 사람의 수
        int answer = 0;
        if(n%slice==0){
            answer = (n/slice);
        }else{
            answer = (n/slice)+1;
        }
        return answer;
    }
}