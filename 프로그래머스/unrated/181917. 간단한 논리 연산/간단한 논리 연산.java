class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean t = true;
        boolean f = false;
        boolean q1 = true;
        boolean q2 = true;
        boolean q3 = true;
        
        if(x1==true||x2==true){
            q1 = true;
        }else{
            q1 = false;
        }
        
          if(x3==true||x4==true){
            q2 = true;
        }else{
            q2 = false;
        }
        
        if(q2==false||q1==false){
            q3 = false;
        }else{
            q3 = true;
        }
        
        answer = q3;
        
        return answer;
    }
}