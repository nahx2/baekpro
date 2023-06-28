class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer = new String[strArr.length];
        for(int i=0; i<strArr.length;i++){
            //짝수번째 인덱스의 문자열은 모든 문자를 소문자
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            } else{
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}