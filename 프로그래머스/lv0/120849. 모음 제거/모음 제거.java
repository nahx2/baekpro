class Solution {
    public String solution(String my_string) {
        String answer = "";
       
        //배열에 넣고 모음빼고 넣고 string으로 출력 -> 실패
        answer = my_string.replaceAll("[aeiou]", "");
      
        return answer;
    }
}