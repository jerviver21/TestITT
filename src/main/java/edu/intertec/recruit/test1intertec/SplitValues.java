

package edu.intertec.recruit.test1intertec;

/**
 * @author Jerson Viveros
 */
public class SplitValues {
    int[] A;
    
    public int solution(int X, int[] A) {
        int valSplit = -1;
        this.A = A;
        int lenghtA = A.length;
        
        for(int candidate = 0; candidate < lenghtA; candidate++){
            if(isValSplit(candidate, X)){
                return candidate;
            }
        }
        
        return valSplit;
    }

    private boolean isValSplit(int candidate, int X) {
        boolean isValSplit = false;
        int lenghtA = A.length;
        
        int countEquals = 0;
        for(int i=0; i < candidate; i++){
            if(A[i]==X){
                countEquals++;
            }
        }
        
        int countDifferent = 0;
        for(int i=candidate; i < lenghtA; i++){
            if(A[i]!=X){
                countDifferent++;
            }
        }
        
        isValSplit = countEquals == countDifferent;
        
        
        return isValSplit;
    }
    
}
