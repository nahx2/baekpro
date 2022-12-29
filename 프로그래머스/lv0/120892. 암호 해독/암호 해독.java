class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        //cipher을 배열에 넣기
        String acipher[] = cipher.split("");
        //[(code-1)+(code*i)]
        for(int i=0;i<(int)(acipher.length/code);i++){
            answer += acipher[(code-1)+(code*i)];
        }
        return answer;
    }
}