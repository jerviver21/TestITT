package edu.intertec.recruit.test1intertec;

/**
 * @author Jerson Viveros
 */
public class BitandProduct2 {
    /**
    * @author Jerson Viveros - Java E.E. Developer
    */
    
    /**
     * Solve the problem
     * @param M
     * @param N
     * @return 
     */
    public int solution(int M, int N) {
        if(N<M || M==0){
            return 0;
        }
        int A = M;
        int B = N;
        
        //Considering that the AND product is associative, iterate in both sense from M to N and from N to M
        for(int i=M+1, j=N-1; i<=N; i++, j--){
            if(B==0 || A==0){
                return 0;
            }
            A &= i;
            if((j - i) == 0){
                return A & B;
            }
            B &= j;
            if((j - i) == 1){
                return A & B;
            }
        }
        return A;
    }  
}
