class Solution {
    public String solution(String my_string) {
        String answer = "";
        //my_string 배열에 넣고 
        String[] strToStrArray = my_string.split("");
        //뒤집어 넣고 
         String[] strToStrArray2 = my_string.split("");
        for (int i=0; i < strToStrArray.length; i++)
            answer += strToStrArray[strToStrArray.length-(i+1)];
        
        return answer;
    }
}