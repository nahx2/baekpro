class Solution {
    public String solution(int age) {
        String answer = "";

        //숫자와 영어를 매칭해야함
       
        String alpha = "abcdefghij";
        String[] arralpha =  alpha.split("");
        System.out.println(arralpha[0]);
        
        String sage = Integer.toString(age);
        String[] arrsage =  sage.split("");
        System.out.println(arrsage[0]);
        //arrsage의[i]와 j가 같다면 플러스 해주기
        for(int j=0; j<arrsage.length;j++){
            
            for(int i=0; i<arralpha.length;i++){
                if(Integer.parseInt(arrsage[j])==i){
                    //System.out.println(arrsage[j]);
              answer += arralpha[i];
          }
            }
          
        }
  
       
        return answer;
    }
}