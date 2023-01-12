class Solution {
    public String solution(String rsp) {
        String answer = "";
        String arrrsp[] = rsp.split("");
        for(int i=0;i<arrrsp.length;i++){
            if(arrrsp[i].equals("0")){
                answer += "5";
            }else if(arrrsp[i].equals("2")){
                answer += "0";
            }else if(arrrsp[i].equals("5")){
                answer += "2";
            }
        }
        return answer;
    }
}