/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intertec.recruit.test1intertec;

/**
 *
 * @author Manager
 */
public class AdjacentValues2 {
     int[] A;
     int maxDistance = -1;
     int lenght = 0;
    
    public int solution(int[] A){
        this.A = A;
        this.lenght = A.length;
        findMaxDistance(0, 1);
        return maxDistance;
    }

    private void findMaxDistance(int index,  int indexNext){

        if(indexNext == lenght){
            if((index+1) == (indexNext-1)){
                return;
            }else{
                findMaxDistance(index+1, index+2);
                return;
            }
        }
        
        int value = A[index];
        int valueNext = A[indexNext];

        if(Math.abs(value-valueNext)==1){
            if(1 > maxDistance){
                maxDistance = 1;
            }
            findMaxDistance(index, indexNext+1);
        }
        
        if(value == valueNext){
            findMaxDistance(index, indexNext+1);
        }

        boolean isAdjacent = true;
        for(int valBetween : A){
             if((value > valBetween && valBetween > valueNext) || (valueNext > valBetween && valBetween > value)){
                 isAdjacent = false;
                 break;
             }
         } 

        if(isAdjacent){
            int distance =  Math.abs(index-indexNext);
            if(distance > maxDistance){
                maxDistance = distance;
            }
        }
        
        findMaxDistance(index, indexNext+1);
    }

}
