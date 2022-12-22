class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int j = 0;
        int h = 0;
        for(int i =0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                ++j;
            }else{
                ++h;
            }
        }
        answer = new int[] {j,h};
        return answer;
    }
}