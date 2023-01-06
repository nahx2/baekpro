class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intmy_string = my_string.replaceAll("[^0-9]", "");
            System.out.println(intmy_string);
        String arranswer[] = intmy_string.split("");
        for(int i=0;i<arranswer.length;i++){
            answer += Integer.parseInt(arranswer[i]);
        }
        return answer;
    }
}