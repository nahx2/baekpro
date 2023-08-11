class Solution {
    public int solution(int n) {
        int answer = 0;
        int h = 0;
        int j = 0;
        if(n%2==0){
            for(int i=0;i<n+1;i++){
                if(i%2==0){
                    answer += i*i;
                }
            }
        }else{
              for(int i=0;i<n+1;i++){
                if(i%2==1){
                    answer += i;
                }
            }
        }
        
        return answer;
    }
}