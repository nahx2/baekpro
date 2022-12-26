class Solution {
    public int solution(int n) {
        int answer = 0;
        //n이 0이 아니면 n이 0이 될 때 까지
        //10으로 나눠서 나머지인 자릿값을 answer에 +하고
        //몫을 n으로 저장 
           while(n!=0){
            answer = answer+ (n%10);
            n = (int)(n/10);
        }
        return answer;
    }
}