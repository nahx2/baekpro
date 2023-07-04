class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a =0;
        int b = 0;
        //arr2가 크다면 -1
        if(arr1.length<arr2.length){
            answer = -1;
        }else if(arr1.length>arr2.length){    //arr1이 크다면 1
            answer = 1;
        }else if(arr1.length==arr2.length){ //두 배열이 같다면 0
          for(int i=0;i<arr1.length;i++){
              a += arr1[i];
              b += arr2[i];
          }
            if(a>b){
                answer = 1;
            }else if(a<b){
                answer = -1;
            }else if(a==b){
                answer = 0;
            }
        }
        
        return answer;
    }
}