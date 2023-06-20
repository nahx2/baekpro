class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int a = num_list.length;
        answer = new int [a+1];
        for(int i = 0; i< num_list.length; i++){
            answer[i]=num_list[i];
            //마지막 원소가 그전 원소보다 크면
        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
            //마지막 원소에서 그전 원소를 뺀 값을 추가하여 return
            answer[answer.length-1] = num_list[num_list.length-1]-num_list[num_list.length-2];
        } else {
            //마지막 원소를 두 배한 값을 추가하여 return
             answer[answer.length-1] = num_list[num_list.length-1]*2;
        }
        }
        
        return answer;
    }
}