class Solution {
    public int solution(int num) {
        int answer = 0;
        //주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
        int k = 0;
        if(num==1){
                answer = 0;
            } else {
                // 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
                while(num>1){
                    if(num%2==0){
                        num=num/2;
                        k++;
                    }else{
                        num=num*3+1;
                        k++;
                    }
                }
                if(num==1){
                    answer=k;
                }else{
                    answer=-1;
                }
        
          
            }
            

        return answer;
    }
}