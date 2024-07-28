public class MinimumValue {
    static void findMinValur(int[] minArray){
        int min = minArray[0];
        for (int i = 1 ; i < minArray.length ; i++){
            if (min > minArray[i]){
                min = minArray[i];
            }
        }
        System.out.println("the minimum value is " + min);
    }
    public static void main (String[] args){
        int[] minArray ={51,26,35,84,96,24,73,10,9,8,6,11,86};

        findMinValur(minArray);
    }
}
