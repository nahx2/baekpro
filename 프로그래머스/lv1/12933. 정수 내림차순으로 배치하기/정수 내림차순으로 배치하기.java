import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = String.valueOf(n);
        String[] arr = a.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        String b = String.join("", arr);
        System.out.println(b);
        answer = Long.parseLong(b);  
        return answer;
    }
}