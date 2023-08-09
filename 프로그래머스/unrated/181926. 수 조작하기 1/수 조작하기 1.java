import java.util.Arrays;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int w = 0;
        int s = 0;
        int d = 0;
        int a = 0;
        String[]  arr_control = control.split("");
        //System.out.print(n);
        for(int i=0;i<arr_control.length;i++){
            if(arr_control[i].equals("w")){
                ++w;
            } else if(arr_control[i].equals("a")){
                ++a;
            } else if(arr_control[i].equals("s")){
                ++s;
            } else if(arr_control[i].equals("d")){
                ++d;
            }
        }
            //System.out.print(w);
            n = n+w+(-s)+(10*d)+(-10*a);
        answer = n;
        return answer;
    }
}