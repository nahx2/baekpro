class Solution {
    public int solution(int a, int b, boolean flag) {
        //참일때만 if문 수행하므로
        //거짓일 경우를 베이스로 둔다
        int answer = a-b;

        if(flag){
            answer = a+b;
        } 
        return answer;
    }
}