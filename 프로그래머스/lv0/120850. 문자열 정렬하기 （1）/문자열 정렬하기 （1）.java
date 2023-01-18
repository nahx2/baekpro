import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        my_string = my_string.replaceAll("[a-z]","");
        System.out.println(my_string); 
        //int imy_string = Integer.parseInt(my_string);
        String amy_string[] = my_string.split("");
        //System.out.println(amy_string[0]); 
        answer = new int [amy_string.length];
        
        for(int i=0; i<amy_string.length;i++){
            answer[i] = Integer.parseInt(amy_string[i]);
        }
        
        //sort() 함수 내부에서 변수 arr의 순서를 변경해주기 때문에 따로 arr에 할당해줄 필요가 없습니다.
        //answer = Arrays.sort(answer); 
        
        Arrays.sort(answer);
        
        return answer;
    }
}