class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        answer = new int[arr.length];
        //arr의 각 원소에 대해 
        for(int i = 0;i<arr.length;i++){
            //값이 50보다 크거나 같은 짝수라면 2로 나누고, 
            if(50<=arr[i]&&arr[i]%2==0){
                answer[i] = arr[i]/2;
            }
            //50보다 작은 홀수라면 2를 곱합니다.
            else if(arr[i]<50&&arr[i]%2==1){
                answer[i] = arr[i]*2;
            }else{
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}