class Solution {
    public int[] solution(int n) {
        //answer = {};
        int j = 0;
         int[] a = new int[10000];
        
        for(int i=1;i<=n;i++){
          // for(int j=0;j<n-1;j++){
                if(n%i==0){
                   a[j]=i;
                    j++;
                }
           //     }
          }
           //     System.out.println(a); 
            int[] answer = new int[j];
            
            for(int k=0;k<j;k++){
                if(a[k]!=0){
                    answer[k]=a[k];
                }
            }
      
        return answer;
    }
}