class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        //target이 문자열 my_string의 부분 문자열이라면 1을
        if(my_string.contains(target)){
            answer=1;
        }
        //아니라면 0을
        return answer;
    }
}