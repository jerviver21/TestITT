package edu.intertec.recruit.test1intertec;

/**
 * Hello world!
 *
 */
public class AppMain 
{
    public static void main( String[] args )
    {
        //Problema 1
        AdjacentValues av = new AdjacentValues();
        AdjacentValues2 av2 = new AdjacentValues2();
        int[] A = new int[]{1,4,7,3,3,5,2,2};
        System.out.println("4: ---> "+av.solution(A));
        System.out.println("4: ---> "+av2.solution(A));
        
        //Problema 2
        SplitValues sv = new SplitValues();
        int[] B = new int[]{5,5,1,7,7,2,3,5};
        System.out.println("6: ---> "+sv.solution(7,B));
        
        
        BitandProduct bp = new BitandProduct();
        System.out.println("4: ----> "+bp.solution(5, 7));
        
    }
}
