class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int s = 0;
        for(int i=0;i<numbers.length;i++){
            s += numbers[i];
            if(s>n){
                
                answer = s;
                break;
            }
        }
        return answer;
    }
}