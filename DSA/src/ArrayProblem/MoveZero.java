package ArrayProblem;

public class MoveZero {
    static void MoveThezero(int[] arr){
        int j = 0;
        for (int i = 0 ; i < arr.length ;i++){
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args){

        int[] moveTheValue ={15,63,0,2,0,25,0,59,36,0,69};
        MoveThezero(moveTheValue);

        for (int j : moveTheValue) {
            System.out.print(j + " ");
        }
    }
}
