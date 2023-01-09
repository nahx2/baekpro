
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int[] a = {};
        int b = 0;
        a = new int[numlist.length];
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                a[b] = numlist[i];
                b++;
            }
        }
        System.out.print(a[0]);
        answer = new int[b];
        
       for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                answer[j] = a[j];
            }
        }
        
        return answer;
    }
}