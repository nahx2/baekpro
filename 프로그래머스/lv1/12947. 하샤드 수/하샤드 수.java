class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = 0; // 자릿수의 합
        int k = x; //x를 해치지 않게
        //자릿수의 합을 구하기>while문
        while(k>0){
            y += k%10;
            k = k/10;
        }
         System.out.println(y);
        //if문으로 true인지 false인지 answer에 넣기
        if(x%y!=0){
            answer = false;
        }
        return answer;
    }
}