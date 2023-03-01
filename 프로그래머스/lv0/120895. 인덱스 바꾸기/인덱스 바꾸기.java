import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] amy_string = my_string.split("");
        String[] amy_string2 = my_string.split("");
        for(int i=0;i<amy_string.length;i++){
            if(i==num1){
                amy_string[i]=amy_string2[num2];
            }else if(i==num2){
                amy_string[i]=amy_string2[num1];
            }
        }
        answer = String.join("", amy_string);       
        return answer;
    }
}