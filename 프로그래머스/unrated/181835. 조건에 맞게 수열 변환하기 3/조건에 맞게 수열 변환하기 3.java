class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
   
            //k가 홀수라면 arr의 모든 원소에 k를 곱하고,
            if(k%2==1){
                   answer[i] = arr[i]*k;
            }
            //k가 짝수라면 arr의 모든 원소에 k를 더합니다.
            else{
                answer[i] = arr[i]+k;
            }
                 
        }
        return answer;
    }
}