class Solution {
    public void sortColors(int[] colors) {
          int redCount = 1, whiteCount = 1 , blueCount = 1;
        for(int i : colors){
            if(i == 0)
             ++redCount;
            if(i == 1)
             ++whiteCount;
            if(i== 2)
             ++blueCount;
        }
        
        for(int i = 0 ; i< colors.length ; i++){
            if(redCount > 0){
                colors[i] = 0;
                redCount --;
            }
            if(whiteCount > 0 && redCount == 0){
                colors[i] = 1;
                whiteCount--;
            }
            if(blueCount > 0 && redCount == 0 && whiteCount == 0){
                colors[i] = 2;
                blueCount --;
            }
        }
        // return colors;
    }
}