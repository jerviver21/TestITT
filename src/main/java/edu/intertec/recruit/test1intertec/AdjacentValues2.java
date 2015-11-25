/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intertec.recruit.test1intertec;

/**
 * @author Manager
 */
public class AdjacentValues2 {
    /**
    * @author Jerson Viveros - Java E.E. Developer
    */
    
     int[] A;
     int maxDistance = -1;
     int length = 0;
    
     /**
      * Solve the problem
      * @param A
      * @return 
      */
    public int solution(int[] A){
        this.A = A;
        this.length = A.length;
        for (int P = 0; P < length; P++) {
            findAdjacentValues(P);
        }
        int result = maxDistance;
        maxDistance = -1;
        return result;
    }

    /**
     * Iterate the array finding adjacents values
     * @param P 
     */
    private void findAdjacentValues(int P){
        for (int Q = (length-1);  Q > P; Q--) {
            if((Q-P) < maxDistance){
                break;
            }
            
            int valP = A[P];
            int valQ = A[Q];
            
            if(valP == valQ){
                continue;
            }

            if(valP-valQ==1 || valP-valQ==-1){
                checkMaxDistance(P, Q);
                continue;
            }
            
            boolean isAdjacent = true;
            for(int valBetween : A){
                 if((valP > valBetween && valBetween > valQ) || (valQ > valBetween && valBetween > valP)){
                     isAdjacent = false;
                     break;
                 }
             } 

            if(isAdjacent){
                checkMaxDistance(P, Q);
            }
       }    
    }
    
    /**
     * Check the max distance between index
     * @param indexP
     * @param indexQ 
     */
    private void checkMaxDistance(int indexP, int indexQ){
        int distance = indexQ-indexP;
        if(distance > maxDistance){
            maxDistance = distance;
        }
    }

}
