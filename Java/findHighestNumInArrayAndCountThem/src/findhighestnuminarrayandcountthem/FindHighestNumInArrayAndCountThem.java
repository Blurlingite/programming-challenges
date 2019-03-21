/*
You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age.
When she blows out the candles, she’ll only be able to blow out the tallest ones. 
Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out 
candles successfully, since the tallest candles are of height  and there are  such candles.
 */
package findhighestnuminarrayandcountthem;

/**
 *
 * @author vishnukdawah
 */
public class FindHighestNumInArrayAndCountThem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] arrayOfNums = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
        
        int theElement = arrayOfNums[0];
        int biggestNum = 0;
        
        int biggestNumCounter = 0;
        
        // first find the biggest num
        
        for(int i = 0; i < arrayOfNums.length; i++){
            
            if(theElement < arrayOfNums[i]){
                biggestNum = arrayOfNums[i];
                theElement = arrayOfNums[i];
            }
            else{
                biggestNum = theElement;
            }
            
        }
        
        
        // now look through the array again, this time counting how many times the biggest num appears
        for(int i = 0; i < arrayOfNums.length; i++){
            
            if(arrayOfNums[i] == biggestNum){
                biggestNumCounter++;
            }
        
        }
        
        
        
        
        System.out.println(biggestNumCounter);
        
    }
    
}
