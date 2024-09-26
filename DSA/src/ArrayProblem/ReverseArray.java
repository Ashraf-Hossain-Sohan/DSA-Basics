package ArrayProblem;

public class ReverseArray {
    static void SetArrayInReverse(int newArray[] , int start , int end){
        while(start < end){
            int temp = newArray[start];
            newArray[start] = newArray[end];
            newArray[end] = temp;
            start++;
            end--;
        }
    }
    public static void main (String[] args){
        int[] newArray = {2,5,8,15,36,40,52,96,31,87,236,25,336};

        SetArrayInReverse(newArray , 0 , newArray.length - 1);
        for (int i = 0 ; i < newArray.length ;i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
