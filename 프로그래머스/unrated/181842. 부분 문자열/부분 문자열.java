class Solution {
    public int solution(String str1, String str2) {
         //아니라면 0을
        int answer = 0;
        //str1이 str2의 부분 문자열이라면 1을
        if(str2.contains(str1)){
            answer=1;
        }
        return answer;
    }
}