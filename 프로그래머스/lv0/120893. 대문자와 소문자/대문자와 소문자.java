import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";

 char[] list;
        list= my_string.toCharArray();
        for(int i=0; i<list.length; ++i){
            if(65<=list[i] && list[i]<=90){
                list[i]=(char)(list[i]+32);
                } else {
                list[i]=(char)(list[i]-32);
            }
            }
       
answer = String.valueOf(list);

        return answer;
    }
}