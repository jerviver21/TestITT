package edu.intertec.recruit.test1intertec;

/**
 * @author Jerson Viveros
 */
public class AdjacentValues {
    int[] A;
    

    public int solution(int[] A){
        this.A = A;
        int maximunDistance = -1;
        int lenghtA = this.A.length;
        
        for(int P:A){
            int maxDistanceP = findMaxDistance(P, lenghtA);
            if(maxDistanceP > maximunDistance){
                maximunDistance = maxDistanceP;
            }
        }
        return maximunDistance;
    }
    
    
    private int findMaxDistance(int P, int lenghtA){
        int maxDistanceP = -1;
        for(int Q=(P+1); Q<lenghtA; Q++){
            int valP = A[P];
            int valQ = A[Q];
            if(areIndexAdjacent(valP, valQ)){
                int distancePQ = Math.abs(P-Q);
                if( distancePQ > maxDistanceP){
                    maxDistanceP = distancePQ;
                }
            }  
        }
        return maxDistanceP;
    }
    
    private boolean areIndexAdjacent(int valP, int valQ){
        if(Math.abs(valQ-valP)==1){
            return true;
        }
        if(valQ==valP){
            return false;
        }
        for(int valBetween : A){
            if((valQ > valBetween && valBetween > valP) || (valP > valBetween && valBetween > valQ)){
                return false;
            }
        }
        return true;
    }
    
}
