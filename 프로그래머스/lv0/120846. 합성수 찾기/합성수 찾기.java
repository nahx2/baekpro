class Solution {
    public int solution(int n) {
        int answer = 0;
        int g = 0;      //개수
        //포문으로 돌려서
        for(int i=1;i<n+1;i++){
            //이프문 2로 나눠지는지 3으로 5로 7로
            if(i%2==0&&i!=2){
                g += 1;
            }else if(i%3==0&&i!=3){
                g += 1;
            }else if(i%5==0&&i!=5){
                g += 1;
            }else if(i%7==0&&i!=7){
                g += 1;
            }
        }
         
        answer = g;
        return answer;
    }
}