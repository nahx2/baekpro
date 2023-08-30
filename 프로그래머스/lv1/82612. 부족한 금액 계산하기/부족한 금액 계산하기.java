class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        //int a = 0;      //금액담을 변수
        for(int i=1;i<count+1;i++){
            answer += price*i;
        }
        if(answer>money){
            answer = answer-money;
        }else{
            answer = 0;
        }
        return answer;
    }
}