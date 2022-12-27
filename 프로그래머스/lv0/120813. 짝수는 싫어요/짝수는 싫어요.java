class Solution {
    public int[] solution(int n) {
        //n이하의 홀수
        int[] answer = {};
        int k = 0;
        //배열의 길이는
        if(n%2==0){
            k = (int)(n/2);
        }else{
            k = (int)(n/2+1);
        }
        
        answer = new int[k];
           int j = 0;
        for(int i = 1; i<=n;i++){
             if(i%2==1){
         answer[j]=i;
                 j++;
                 }
        }
        return answer;
    }
}