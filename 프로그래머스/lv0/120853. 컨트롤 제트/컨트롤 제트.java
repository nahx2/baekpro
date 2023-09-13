class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] a = {};
          a = s.split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i].equals("Z")){
                answer-= Integer.parseInt(a[i-1]);
            }else{
                answer+= Integer.parseInt(a[i]);
            }
        }
        return answer;
    }
}