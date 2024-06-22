public class Can_place_flower {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        boolean canplace = true;
        for(int i=0; i< length; i++){
            if(flowerbed [i]== 0){
                canplace = true;
                if(i > 0&&flowerbed[i-1]==1) canplace = false;
                if(i == 0 && flowerbed[i+1] == 1) canplace = false;
                if(canplace){
                    flowerbed[i] = 1;
                    count++; 
                    if(count >= n) return true;
                } 
            } 
        }
        return false;
    }
}
