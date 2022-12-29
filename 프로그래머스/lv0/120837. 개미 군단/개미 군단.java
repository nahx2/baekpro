class Solution {
    public int solution(int hp) {
        int answer = 0;
        int j = 5;
        int b = 3;
        int i = 1;
        int jg = 0;
        int bg = 0;
        int ig = 0;
      //j개미를 최대로 넣고 차례차례
        while(hp!=0){
             if(hp>=j){
                 jg = (int)(hp/j);
                 hp = hp-(j*jg);
                  System.out.println("jg:"+jg); 
                    //break;
             }else if(hp>=b){
                bg=(int)(hp/b);
                  hp =   hp-(b*bg);
                 System.out.println("bg:"+bg); 
                //break;
             }else if(hp>=i){
                    ig=hp/i;
                  hp =   hp-(i*ig);
                 System.out.println("ig:"+ig);
                     //break; 
                }
        }
       answer = jg+bg+ig;
        return answer;
    }
}