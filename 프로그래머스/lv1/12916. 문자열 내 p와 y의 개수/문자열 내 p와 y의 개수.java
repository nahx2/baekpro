import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String a[] = s.split("");
        int pg = 0;
        int yg = 0;
        //System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i].equals("p")){
                ++pg;
            }else if(a[i].equals("y")){
                ++yg;
            }else if(a[i].equals("P")){
                ++pg;
            }else if(a[i].equals("Y")){
                ++yg;
            }
        }
       
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(pg+","+yg);

        if(pg!=yg){
            answer=false;
        }
        return answer;
    }
}