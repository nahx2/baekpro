class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int k = 0;
        answer = new int [num2-num1+1];
        // num1과 num2사이면 answer에 포함시키기
        for(int i=0;i<numbers.length;i++){
            if(num1<=i&&i<=num2){
                answer[k] +=  numbers[i];
                k++;
            }
        }
        
        return answer;
    }
}