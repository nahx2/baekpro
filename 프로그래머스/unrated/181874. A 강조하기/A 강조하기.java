class Solution {
    public String solution(String myString) {
        String answer = "";
        String a = "a";
        String ms = myString.toLowerCase();
        answer = ms.replace(a, a.toUpperCase());
        return answer;
    }
}