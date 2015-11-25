package edu.intertec.recruit.test1intertec;

/**
 * @author Manager
 */
public class SplitValues2 {
    /**
    * @author Jerson Viveros - Java E.E. Developer
    */
    
    private int[] A;
    private int length = 0;
    private int numTimesX = 0;
    private int minimumPoint = 0;
    
    /**
     * Solve the problem
     * @param X
     * @param A
     * @return 
     */
    public int solution(int X, int[] A) {
        int valSplit = -1;
        this.setA(A);
        length = A.length;
        
        for(int c:A){
            if(c==X){
                numTimesX++;
            }
        }
        
        if(numTimesX==0){
            //throw new XNoExistException("The X value must exist");//Is one of the conditions defined in the problem
            return -1;
        }
        minimumPoint = length - numTimesX;
        
        for(int candidate = minimumPoint; candidate < length; candidate++){
            if(isValSplit(candidate, X)){
                numTimesX = 0;
                return candidate;
            }
        }
        numTimesX = 0;
        return valSplit;
    }

    /**
     * Define if the an index(candidate) is the value we are looking for
     * @param candidate
     * @param X
     * @return 
     */
    private boolean isValSplit(int candidate, int X) {
        boolean isValSplit = false;

        
        int countDifferent = 0;
        for(int i=candidate; i < length; i++){
            if(A[i]!=X){
                countDifferent++;
            }
        }
        int countEquals = numTimesX - (length-candidate-countDifferent);
        
        isValSplit = countEquals == countDifferent;
        return isValSplit;
    }

    /**
     * The problem define that elements in the input array can be modified
     * @param A 
     */
    public void setA(int[] A) {
        this.A = A;
    }
    
    
}
