
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        //중간원소
        int i = (int)(array.length/2);
        answer = array[i];
        return answer;
    }
}