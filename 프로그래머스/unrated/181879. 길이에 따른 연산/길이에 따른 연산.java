class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        for(int i=0;i<num_list.length;i++){
            
            if(num_list.length>10) {
                answer += num_list[i];
            } else {
                a *= num_list[i];
                answer = a;
            }
        }
        
        return answer;
    }
}