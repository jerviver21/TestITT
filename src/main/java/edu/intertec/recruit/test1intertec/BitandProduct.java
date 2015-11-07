package edu.intertec.recruit.test1intertec;

/**
 * @author Jerson Viveros
 */
public class BitandProduct {
    public int solution(int M, int N) {
        return solution(M, N,  (M & (M+1)));
    }
    
    private int solution(int M, int N, int lastProduct) {
        if((M+1) == N){
            return lastProduct & N;
        }else{
            return solution((M+1), N,  (M & (M+1)));
        }
    }
}
