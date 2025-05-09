import java.util.*;

class Solution {
    boolean solution(String s) {
        int check = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                check++;
            }
            if(s.charAt(i) == ')'){
                check--;
            }
            
            if(check < 0) return false;
        }
        
        if(check != 0 ) return false;

        return true;
    }
}