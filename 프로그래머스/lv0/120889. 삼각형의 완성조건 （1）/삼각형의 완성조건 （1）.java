class Solution {
    public int solution(int[] sides) {
        //1. 가장 긴 변을 찾기
        //2. 긴 변과 그 외의 변의 합을 비교하기
        int answer = 0;
        int h = 0;
        int hap = 0;
        for(int i=0;i<sides.length;i++){
            hap += sides[i];
            if(sides[i]>h){
                h = sides[i];
            }
        }
       
        if(h<hap-h){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}