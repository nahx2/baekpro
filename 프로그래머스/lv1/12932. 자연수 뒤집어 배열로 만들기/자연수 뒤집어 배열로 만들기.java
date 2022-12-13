class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int j = 0;
        long m = n;
System.out.println(m);
       while(n>0){
            j++;
            n=n/10;
        }
          System.out.println(j);
        answer = new int[j];
        
        for(int y=0;y<j;y++){
              answer[y]=(int)(m%10);
                m=m/10;
        }
        
        return answer;
    }
}