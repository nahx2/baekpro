class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String date[] = num_str.split("");
        
        int num_date[] = new int[date.length];
        
         for (int i = 0; i < date.length; i++) {
            num_date[i] = Integer.parseInt(date[i]);
        }
        
        for(int i = 0; i < num_date.length; i++){
            answer += num_date[i];
        }

        return answer;
    }
}