class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a)+String.valueOf(b);
        int iab = Integer.valueOf(ab);
        int eab = 2*a*b;
        if(iab>eab){
            answer=iab;
        }else if(eab>iab){
             answer=eab;
        }else if(iab==eab){
            answer=iab;
        }
        return answer;
    }
}