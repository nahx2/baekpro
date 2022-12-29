class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        //배열에 하나씩 넣기?
        String[] arr = my_string.split("");
    
        //다중포문?-> 실패
        //repeat
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<n;j++){
                answer += arr[i];
            }   
        }
        return answer;
    }
}