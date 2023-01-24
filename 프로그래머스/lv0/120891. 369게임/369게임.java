class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = Integer.toString(order);
        String[] arr = a.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("3")){
                ++answer;
            }else if(arr[i].equals("6")){
                ++answer;
            }else if(arr[i].equals("9")){
                ++answer;
            }
        }
        return answer;
    }
}