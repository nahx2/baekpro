class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        //int k = start-end+1;
        answer = new int[start-end+1];
        
            for(int j=0;j<answer.length;j++){
                answer[j] = start-j;
            }
            

        return answer;
    }
}