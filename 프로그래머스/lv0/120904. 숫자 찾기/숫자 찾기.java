class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        int a =  (int)(Math.log10(num)+1);
        System.out.println(a); 
        int arrnum[] ={};
        arrnum = new int [a];
        
        for(int i=0; i<a;i++){
            arrnum[a-1-i] = num%10;
            num = (int)(num/10);
        }
        //System.out.println(arrnum[3]); 

        
        for(int j=0;j<a;j++){
    if(arrnum[j]==k){
        answer = j+1;
        break;
    }else{
        answer = -1;
    }
}

     
        return answer;
    }
}