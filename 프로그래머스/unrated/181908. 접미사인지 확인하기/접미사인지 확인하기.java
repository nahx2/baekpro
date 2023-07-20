class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
      String[] list = my_string.split("");
      
        //my_string에 is_suffix 포함되어야함, 그리고 my_string의 마지막 글자로 끝나야함
         if(my_string.contains(is_suffix)&&is_suffix.endsWith(list[list.length-1])==true){
           
                             answer = 1;


        }
        return answer;
        
    }
}