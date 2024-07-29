public class SecondMax {
    static void FindSecondMax(int[] SecondMaxArray){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for( int i = 0 ;i< SecondMaxArray.length ; i++){
            if (SecondMaxArray[i] > max){
                secondMax = max;
                max = SecondMaxArray[i];
            }else if(SecondMaxArray[i] > secondMax && SecondMaxArray[i] != max){
                secondMax = SecondMaxArray[i];
            }
        }
        System.out.println(secondMax);
    }
    public static void main (String[] args){
        int[] SecondMaxArray = {23,56,93,24,2,45,63,33};
        FindSecondMax(SecondMaxArray);
    }
}
