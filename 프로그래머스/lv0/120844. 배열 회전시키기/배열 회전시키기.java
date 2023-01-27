class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        //rigth면 numbers[numbers.length]가 numbers[0]으로
        //left면 numbers[0]가 numbers[numbers.length]로
        answer = new int [numbers.length];

        if(direction.equals("right")){
                      
            for(int i=0;i<numbers.length-1;i++){
                    answer[i+1]=numbers[i];
                answer[0]=numbers[numbers.length-1];
            }

        }else if(direction.equals("left")){
                      
            for(int i=0;i<numbers.length-1;i++){
                    answer[i]=numbers[i+1];
                answer[numbers.length-1]=numbers[0];
            }

        }
        return answer;
    }
}