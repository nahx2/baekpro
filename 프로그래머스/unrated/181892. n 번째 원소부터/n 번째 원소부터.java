class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        //num_list랑 세는 숫자...를 같게 함
        int m = n-1;
        //길이선언
        answer = new int[num_list.length-m];
        
        for(int i=0;i<answer.length;i++){
          answer[i]=num_list[m];
           m++;
        }
        
        return answer;
    }
}