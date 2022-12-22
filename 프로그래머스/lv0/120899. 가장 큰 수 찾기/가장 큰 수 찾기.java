class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
       //배열길이
        answer = new int[2]; 
  
        //값들끼리 계속 비교해야함
        for(int i =0;i<array.length;i++){
            //값 비교해야함
            if(answer[0]<array[i]){
            //만약 큰값이 나타나면 저장하기
            answer[0]=array[i];
                answer[1]=i;
                }
        }
                
         
       
        return answer;
    }
}