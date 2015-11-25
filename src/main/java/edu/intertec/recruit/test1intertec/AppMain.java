package edu.intertec.recruit.test1intertec;

import java.util.Date;

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
        int[] A1 = new int[]{1,4,7,3,3,5};
        int[] A2 = new int[]{1,4,7,3,3,5,2,2, 7, 7, 11,2};
        int[] A3 = new int[]{1,3,7,3,3,5,5,4,6,8, 55, 105 ,170};
        int[] A4 = new int[]{0,0,0, 6, 90,3,50, 2, 109};
        int[] A5 = new int[]{1};
        int[] A6 = new int[]{1,4};
        int[] A8 = new int[]{1,4,6};
        int[] A9 = new int[]{1,4,6,8,10, 15, 20, 25, 30, 35, 40, 45};
        int[] A10 = new int[]{100,90,80,60,50,40,30,20,10,0};
        int[] A7 = new int[40000];
        int range = 2147483647;
        for (int i = 0; i < A7.length; i++) {
            if(i<20000){
                A7[i] = 2;
            }
            A7[i] = (int)(Math.random()*range*2 - range);
        }

        System.out.println("1: ---> "+av.solution(A1)+" - "+av2.solution(A1));
        System.out.println("2: ---> "+av.solution(A2)+" - "+av2.solution(A2));
        System.out.println("3: ---> "+av.solution(A3)+" - "+av2.solution(A3));
        System.out.println("4: ---> "+av.solution(A4)+" - "+av2.solution(A4));
        System.out.println("5: ---> "+av.solution(A5)+" - "+av2.solution(A5));
        System.out.println("6: ---> "+av.solution(A6)+" - "+av2.solution(A6));
        System.out.println("8: ---> "+av.solution(A8)+" - "+av2.solution(A8));
        System.out.println("9: ---> "+av.solution(A9)+" - "+av2.solution(A9));
        System.out.println("10: ---> "+av.solution(A10)+" - "+av2.solution(A10));
        System.out.println("Ini: "+new Date());
        //System.out.println("7.1: ---> "+av.solution(A7));
        System.out.println("Fin: "+new Date());
        System.out.println("Ini: "+new Date());
        System.out.println("7.2: ---> "+av2.solution(A7));
        System.out.println("Fin: "+new Date());   
        System.out.println("*************************");
        

        
        //Problema 2
        SplitValues sv = new SplitValues();
        SplitValues2 sv2 = new SplitValues2();
        int[] B0 = new int[]{4,5,5,5,5,5,5};
        int[] B1 = new int[]{5,5,1,7,7,2,3,5};
        int[] B2 = new int[]{0,1,3,3,7,2,4,5,9,0,3,11,12,13};
        int[] B3 = new int[]{0,1,3,3,7,2,4,5,9,0,3,11,3,13};
        range = 100000;
        int[] B4 = new int[range];
        
        for (int i = 0; i <B4.length; i++) {
            B4[i] = (int)(Math.random()*50);
        }

        
        System.out.println("4: ---> "+sv.solution(5,B0)+" - "+sv2.solution(5, B0));
        System.out.println("4: ---> "+sv.solution(4,B0)+" - "+sv2.solution(4, B0));
        System.out.println("6: ---> "+sv.solution(7,B1)+" - "+sv2.solution(7, B1));
        System.out.println("10: ---> "+sv.solution(1,B2)+" - "+sv2.solution(1, B2));
        System.out.println("10: ---> "+sv.solution(2,B2)+" - "+sv2.solution(2, B2));
        System.out.println("10: ---> "+sv.solution(3,B2)+" - "+sv2.solution(3, B2));
        System.out.println("10: ---> "+sv.solution(4,B2)+" - "+sv2.solution(4, B2));
        System.out.println("10: ---> "+sv.solution(5,B2)+" - "+sv2.solution(5, B2));
        System.out.println("X: ---> "+sv.solution(2,B3)+" - "+sv2.solution(2, B3));
        System.out.println("X: ---> "+sv.solution(3,B3)+" - "+sv2.solution(3, B3));
        System.out.println("X: ---> "+sv.solution(4,B3)+" - "+sv2.solution(4, B3));
        System.out.println("X: ---> "+sv.solution(5,B3)+" - "+sv2.solution(5, B3));
        System.out.println("X: ---> "+sv.solution(6,B3)+" - "+sv2.solution(6, B3));
        System.out.println("X: ---> "+sv.solution(7,B3)+" - "+sv2.solution(7, B3));
        System.out.println("X: ---> "+sv.solution(8,B3)+" - "+sv2.solution(8, B3));
        System.out.println("X: ---> "+sv.solution(9,B3)+" - "+sv2.solution(9, B3));
        System.out.println("X: ---> "+sv.solution(20,B3)+" - "+sv2.solution(20, B3));
        System.out.println("Ini: "+new Date());
        System.out.println("1.1: ---> "+sv.solution(5, B4));
        System.out.println("Fin: "+new Date());
        System.out.println("Ini: "+new Date());
        System.out.println("1.2: ---> "+sv2.solution(5, B4));
        System.out.println("Fin: "+new Date());  
        
        System.out.println("*************************");
        
        
        int M = (int)(Math.random()*(2147483647/2));
        int N = (int)(Math.random()*(2147483647)+(2147483647/2));
        
        BitandProduct bp = new BitandProduct();
        BitandProduct2 bp2 = new BitandProduct2();
        System.out.println("4: ----> "+bp.solution(5, 7)+" - "+bp2.solution(5, 7));
        System.out.println("4: ----> "+bp.solution(12, 15)+" - "+bp2.solution(12, 15));
        System.out.println("4: ----> "+bp2.solution(9, 4));
        System.out.println("4: ----> "+bp.solution(8, 13)+" - "+bp2.solution(8, 13));
        System.out.println("4: ----> "+bp.solution(8, 10)+" - "+bp2.solution(8, 10));
        System.out.println("4: ----> "+bp.solution(2, 3)+" - "+bp2.solution(2, 3));
        System.out.println("4: ----> "+bp.solution(1, 3)+" - "+bp2.solution(1, 3));
        
        System.out.println("Ini: "+new Date());
        System.out.println("N: ----> "+bp2.solution(M, N));
         System.out.println("Fin: "+new Date());
        
        
    }
}
