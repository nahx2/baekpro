class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double j = 0;
        for(int i =0; i<numbers.length;i++){
            j += numbers[i];
        }
        answer = j/numbers.length;
        return answer;
    }
}