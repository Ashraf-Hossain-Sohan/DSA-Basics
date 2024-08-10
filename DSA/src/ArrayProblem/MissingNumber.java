package ArrayProblem;

public class MissingNumber {
    static void MissingValue(int[] FindTheNumber){
        int n = FindTheNumber.length + 1;
        int sum = n * (n+1)/2;
        for(int num : FindTheNumber){
            sum -= num;
        }
        System.out.println(sum);
    }
    public static void main (String[] args){
        int[] FindTheNumber ={1,2,3,4,6,7,8,9};
        MissingValue(FindTheNumber);

    }
}
