/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusminus;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author vishnukdawah
 */
public class PlusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arr = {-4, 3, -9, 0, 4, 1};
        
        int arraySize = arr.length;
        int posNum = 0;
        int negNum = 0;
        int zeroNum = 0;
        
        
        for(Integer currentInt : arr){
            if(currentInt < 0){
                negNum++;
            }else if(currentInt > 0){
                posNum++;
            }else{
                zeroNum++;
            }
        }
        
        
        BigDecimal pNums = new BigDecimal(posNum).setScale(6, RoundingMode.HALF_UP);
        BigDecimal nNums = new BigDecimal(negNum).setScale(6, RoundingMode.HALF_UP);
        BigDecimal zNums = new BigDecimal(zeroNum).setScale(6, RoundingMode.HALF_UP);
        
        BigDecimal arrSize = new BigDecimal(arraySize).setScale(6, RoundingMode.HALF_UP);

        
        pNums.divide(arrSize);
        pNums.divide(arrSize).setScale(6, RoundingMode.HALF_UP);
        zNums.divide(arrSize);

        
        System.out.println(pNums.divide(arrSize));
        System.out.println(nNums.divide(arrSize));
        System.out.println(zNums.divide(arrSize));

        
    }
    
}
