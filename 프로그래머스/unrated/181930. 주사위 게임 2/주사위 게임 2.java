class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int h = a + b + c;
        int z = (a*a) + (b*b) + (c*c);
        int s = (a*a*a) + (b*b*b) + (c*c*c);
        if(a!=b && b!=c && a!=c){
            answer = h;
        }else if(a==b && b==c && a==c){
            answer = h*z*s;
        }else{
            answer = h*z;
        }
        return answer;
    }
}