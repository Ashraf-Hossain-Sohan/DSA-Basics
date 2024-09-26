package ArrayProblem;

public class ResizeArray {
    static int[] ResizeTheArray(int[] GivenArray , int Capacity){
        int[] temp = new int[Capacity];
        for (int i = 0 ; i < GivenArray.length ; i++ ) {
            temp[i] = GivenArray[i];
        }
        return temp;
    }
    public static void main (String[] args){
        int[] needToResize = {10,20,30,40};
        System.out.println(needToResize.length);

        needToResize = ResizeTheArray(needToResize,16);

        System.out.println(needToResize.length);
    }
}
