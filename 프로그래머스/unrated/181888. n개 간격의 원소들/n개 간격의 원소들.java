class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[((num_list.length-1)/n)+1];
        int a = 0;
        for(int i=0;i<num_list.length;i++){
            if(i%n==0){
                answer[a]=num_list[i];
                a++;
            }
        }
        return answer;
    }
}