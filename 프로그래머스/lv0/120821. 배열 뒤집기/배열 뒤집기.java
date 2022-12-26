class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
      answer = new int[num_list.length];
        //뒤집어 넣고 
        for (int i=0; i < num_list.length; i++)
            answer[i] += num_list[num_list.length-(i+1)];
        return answer;
    }
}