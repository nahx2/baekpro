class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int a = (int)(box[0]/n); // 가로에 몇개들가는지
        int b = (int)(box[1]/n); // 세로에 몇개들가는지
        int c = (int)(box[2]/n); // 높이에 몇개들가는지
        answer = a*b*c;
        return answer;
    }
}