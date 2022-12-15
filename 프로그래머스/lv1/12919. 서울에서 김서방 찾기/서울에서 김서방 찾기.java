class Solution {
    public String solution(String[] seoul) {
        String answer = "";
           int j = 0;
      for(int i=0; i<seoul.length; i++){
          if(seoul[i].equals("Kim")){
               j = i;
              break; 
          }
       }
       System.out.println(j);
       answer = "김서방은 "+j+"에 있다";
       return answer;
    }
}