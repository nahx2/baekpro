class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        int c = 0;
        
        for(int i=0;i<num_list.length;i++){
            a *= num_list[i];
            b += num_list[i];
        }
         c = b*b;
        //모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1
         if(a<c){
                answer = 1;
            }else if(a>c){
                answer = 0;
            }
        return answer;
    }
}